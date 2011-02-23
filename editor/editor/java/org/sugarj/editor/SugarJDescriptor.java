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
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.parser.SGLRParseController;

/**
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class SugarJDescriptor extends Descriptor {

  private final IStrategoAppl baseDocument;
  
  private List<IStrategoTerm> lastServices;

  public SugarJDescriptor(Descriptor baseDescriptor) throws BadDescriptorException {
    super(baseDescriptor.getDocument());
    baseDocument = baseDescriptor.getDocument();
  }
  
  @Override
  public synchronized <T extends ILanguageService> T createService(
      Class<T> type, SGLRParseController controller)
      throws BadDescriptorException {
    
    if (controller != null && controller.getParser() instanceof SugarJParser) {
      List<IStrategoTerm> services = ((SugarJParser) controller.getParser()).getEditorServices();
      if (!services.equals(lastServices)) {
        simpleClearCache(controller);
        setDocument(composeDefinitions(baseDocument, services));
        lastServices = services;
      }
    }
    
    return super.createService(type, controller);
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
}
