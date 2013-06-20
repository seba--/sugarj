package org.sugarj.editor;

import static org.spoofax.interpreter.core.Tools.termAt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.imp.language.ILanguageService;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.StrategoListIterator;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.dynamicloading.DynamicParseController;
import org.strategoxt.imp.runtime.dynamicloading.IDynamicLanguageService;
import org.strategoxt.imp.runtime.dynamicloading.IOnSaveService;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.strategoxt.imp.runtime.services.StrategoObserver;
import org.sugarj.common.path.AbsolutePath;

/**
 * A descriptor that creates file-specific editor services.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class SugarJDescriptor extends Descriptor {

  private final IStrategoAppl baseDocument;
  
  private List<IStrategoTerm> lastServices;

  private ExecutorService reloadEditorExecutorService = Executors.newSingleThreadExecutor();
  
  public SugarJDescriptor(Descriptor baseDescriptor) throws BadDescriptorException {
    super(baseDescriptor.getDocument());
    baseDocument = baseDescriptor.getDocument();
    setDynamicallyLoaded(true);
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public synchronized <T extends ILanguageService> T createService(
      Class<T> type, SGLRParseController controller)
      throws BadDescriptorException {
    
    if (controller != null && controller.getParser() instanceof SugarJParser && ((SugarJParser) controller.getParser()).isInitialized()) {
      List<IStrategoTerm> services = ((SugarJParser) controller.getParser()).getEditorServices();
      if (services != null && !services.equals(lastServices)) {
        setDocument(composeDefinitions(baseDocument, services));
        reloadEditors(controller);
        lastServices = services;
        
//        String s = services.toString();
//        int start = s.indexOf("SemanticProvider(");
//        int end = s.indexOf(")", start);
//        if (start > 0) {
//          String f = s.substring(start + "SemanticProvider(".length() + 1, end - 1);
//          System.out.println("Load provider: " + f);
//        }
      }
    }
    
    T result = super.createService(type, controller);
    
    if (result instanceof IOnSaveService)
      result = (T) new SugarJOnSaveService(this, (IOnSaveService) result);
    
    if (result instanceof StrategoObserver) {
      initObserver((StrategoObserver) result);
    }
    
    return result;
  }

  private void initObserver(final StrategoObserver observer) {
    reloadEditorExecutorService.execute(new Runnable() {
      public void run() {
        try {
          observer.getLock().lockInterruptibly();
          observer.setPrototypeAllowed(false);
          ((StrategoObserver) observer).getRuntime(); // eagerly initilize w/ current document
        } catch (InterruptedException e) {
          Environment.logException("could not reinitialize editor: interrupted", e);
        } catch (Exception e) {
          Environment.logException("could not reinitialize editor: exception", e);
        }
        finally {
          observer.getLock().unlock();
        }
      }
    });
  }
  
  private void reloadEditors(SGLRParseController controller) {
    simpleClearCache(controller);
    for (IDynamicLanguageService service : getActiveServices(controller)) {
      try {
        if (!(service instanceof DynamicParseController))
          service.reinitialize(this);
      } catch (BadDescriptorException e) {
        Environment.logWarning("Unable to reinitialize service", e);
      }
    }
  }

  public void reloadAllEditors(int delay) {
    for (IDynamicLanguageService service : getActiveServices()) {
      try {
        if (service instanceof DynamicParseController) {
          SGLRParseController controller = (SGLRParseController) ((DynamicParseController) service).getWrapped();
          simpleClearCache(controller);
          controller.scheduleParserUpdate(delay, false);
        } else {
          service.reinitialize(this);
        }
      } catch (BadDescriptorException e) {
        Environment.logWarning("Unable to reinitialize service", e);
      }
    }
  }

  private static IStrategoAppl composeDefinitions(IStrategoAppl base, List<IStrategoTerm> extensions) {
    IStrategoConstructor cons = base.getConstructor();
    if (cons.getName().equals("Module") && cons.getArity() == 3) {
      ITermFactory factory = Environment.getTermFactory();
      List<IStrategoTerm> allDefinitions = new ArrayList<IStrategoTerm>();
      addAll(allDefinitions, (IStrategoList) termAt(base, 2));
      allDefinitions.addAll(extensions);
      return factory.makeAppl(cons, termAt(base, 0), termAt(base, 1), factory.makeList(allDefinitions));
    } else {
      throw new IllegalStateException("Unsupported editor descriptor format:" + cons);
    }
  }

  private static void addAll(List<IStrategoTerm> all, IStrategoList list) {
    for (IStrategoTerm term : StrategoListIterator.iterable(list)) {
      all.add(term);
    }
  }
  
  @Override
  public InputStream openAttachment(String path) throws FileNotFoundException {
    if (AbsolutePath.acceptable(path))
      return new BufferedInputStream(new FileInputStream(path));
    return super.openAttachment(path);
  }
}
