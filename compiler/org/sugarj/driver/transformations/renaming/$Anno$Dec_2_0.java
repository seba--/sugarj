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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_16, Strategy e_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDec_2_0");
    Fail41:
    { 
      IStrategoTerm r_104 = null;
      IStrategoTerm p_104 = null;
      IStrategoTerm q_104 = null;
      IStrategoTerm s_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      p_104 = term.getSubterm(0);
      q_104 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      r_104 = annos32;
      term = d_16.invoke(context, p_104);
      if(term == null)
        break Fail41;
      s_104 = term;
      term = e_16.invoke(context, q_104);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDec_2, new IStrategoTerm[]{s_104, term}), checkListAnnos(termFactory, r_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}