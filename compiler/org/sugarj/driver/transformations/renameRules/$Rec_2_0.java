package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_15, Strategy q_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail89:
    { 
      IStrategoTerm z_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      IStrategoTerm b_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      x_105 = term.getSubterm(0);
      y_105 = term.getSubterm(1);
      IStrategoList annos82 = term.getAnnotations();
      z_105 = annos82;
      term = p_15.invoke(context, x_105);
      if(term == null)
        break Fail89;
      b_106 = term;
      term = q_15.invoke(context, y_105);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRec_2, new IStrategoTerm[]{b_106, term}), checkListAnnos(termFactory, z_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}