package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_28, Strategy p_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail173:
    { 
      IStrategoTerm x_138 = null;
      IStrategoTerm s_138 = null;
      IStrategoTerm w_138 = null;
      IStrategoTerm y_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      s_138 = term.getSubterm(0);
      w_138 = term.getSubterm(1);
      IStrategoList annos148 = term.getAnnotations();
      x_138 = annos148;
      term = o_28.invoke(context, s_138);
      if(term == null)
        break Fail173;
      y_138 = term;
      term = p_28.invoke(context, w_138);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGt_2, new IStrategoTerm[]{y_138, term}), checkListAnnos(termFactory, x_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}