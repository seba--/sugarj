package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_1_0 extends Strategy 
{ 
  public static module_1_0 instance = new module_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_1_0");
    Fail1057:
    { 
      IStrategoTerm b_470 = null;
      IStrategoTerm a_470 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consmodule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1057;
      a_470 = term.getSubterm(0);
      IStrategoList annos284 = term.getAnnotations();
      b_470 = annos284;
      term = m_351.invoke(context, a_470);
      if(term == null)
        break Fail1057;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consmodule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}