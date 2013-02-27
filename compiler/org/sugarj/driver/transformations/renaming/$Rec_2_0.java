package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_15, Strategy p_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail93:
    { 
      IStrategoTerm y_105 = null;
      IStrategoTerm w_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm z_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      w_105 = term.getSubterm(0);
      x_105 = term.getSubterm(1);
      IStrategoList annos82 = term.getAnnotations();
      y_105 = annos82;
      term = o_15.invoke(context, w_105);
      if(term == null)
        break Fail93;
      z_105 = term;
      term = p_15.invoke(context, x_105);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRec_2, new IStrategoTerm[]{z_105, term}), checkListAnnos(termFactory, y_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}