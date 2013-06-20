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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_1_0");
    Fail213:
    { 
      IStrategoTerm p_137 = null;
      IStrategoTerm o_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consmodule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail213;
      o_137 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      p_137 = annos173;
      term = w_26.invoke(context, o_137);
      if(term == null)
        break Fail213;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consmodule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}