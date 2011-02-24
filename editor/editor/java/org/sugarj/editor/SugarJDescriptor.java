package org.sugarj.editor;

import static org.spoofax.interpreter.core.Tools.termAt;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.imp.language.ILanguageService;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.StrategoListIterator;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.dynamicloading.AbstractService;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.dynamicloading.DynamicParseController;
import org.strategoxt.imp.runtime.dynamicloading.IDynamicLanguageService;
import org.strategoxt.imp.runtime.dynamicloading.IOnSaveService;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.strategoxt.imp.runtime.services.StrategoObserver;

/**
 * A descriptor that creates file-specific editor services.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class SugarJDescriptor extends Descriptor {
  
  private static final int REPARSE_OTHER_EDITOR_DELAY = 1000;

  private final IStrategoAppl baseDocument;
  
  private List<IStrategoTerm> lastServices;

  public SugarJDescriptor(Descriptor baseDescriptor) throws BadDescriptorException {
    super(baseDescriptor.getDocument());
    baseDocument = baseDescriptor.getDocument();
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public synchronized <T extends ILanguageService> T createService(
      Class<T> type, SGLRParseController controller)
      throws BadDescriptorException {
    
    if (controller != null && controller.getParser() instanceof SugarJParser) {
      List<IStrategoTerm> services = ((SugarJParser) controller.getParser()).getEditorServices();
      if (services != null && !services.equals(lastServices)) {
        reloadEditors(controller);
        setDocument(composeDefinitions(baseDocument, services));
        lastServices = services;
      }
    }
    
    T result = super.createService(type, controller);
    if (result instanceof IOnSaveService)
      result = (T) new SugarJOnSaveService(this, (IOnSaveService) result);
    if (result instanceof StrategoObserver)
      ((StrategoObserver) result).setPrototypeAllowed(false);
    return result;
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

  public void reloadAllEditors() {
    for (IDynamicLanguageService service : getActiveServices()) {
      try {
        if (service instanceof DynamicParseController) {
          SGLRParseController controller = (SGLRParseController) ((DynamicParseController) service).getWrapped();
          simpleClearCache(controller);
          controller.scheduleParserUpdate(REPARSE_OTHER_EDITOR_DELAY, false);
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
      allDefinitions.addAll(extensions);
      addAll(allDefinitions, (IStrategoList) termAt(base, 2));
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
}
