package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec_2_0 extends Strategy 
{ 
  public static $Anno$Dec_2_0 instance = new $Anno$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_17, Strategy b_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDec_2_0");
    Fail46:
    { 
      IStrategoTerm p_105 = null;
      IStrategoTerm n_105 = null;
      IStrategoTerm o_105 = null;
      IStrategoTerm r_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      n_105 = term.getSubterm(0);
      o_105 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      p_105 = annos32;
      term = a_17.invoke(context, n_105);
      if(term == null)
        break Fail46;
      r_105 = term;
      term = b_17.invoke(context, o_105);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDec_2, new IStrategoTerm[]{r_105, term}), checkListAnnos(termFactory, p_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}