package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_342, Strategy a_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail896:
    { 
      IStrategoTerm q_447 = null;
      IStrategoTerm o_447 = null;
      IStrategoTerm p_447 = null;
      IStrategoTerm r_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail896;
      o_447 = term.getSubterm(0);
      p_447 = term.getSubterm(1);
      IStrategoList annos142 = term.getAnnotations();
      q_447 = annos142;
      term = z_342.invoke(context, o_447);
      if(term == null)
        break Fail896;
      r_447 = term;
      term = a_343.invoke(context, p_447);
      if(term == null)
        break Fail896;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRec_2, new IStrategoTerm[]{r_447, term}), checkListAnnos(termFactory, q_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}