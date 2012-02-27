package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_24, Strategy e_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail136:
    { 
      IStrategoTerm f_125 = null;
      IStrategoTerm d_125 = null;
      IStrategoTerm e_125 = null;
      IStrategoTerm h_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      d_125 = term.getSubterm(0);
      e_125 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      f_125 = annos116;
      term = d_24.invoke(context, d_125);
      if(term == null)
        break Fail136;
      h_125 = term;
      term = e_24.invoke(context, e_125);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMul_2, new IStrategoTerm[]{h_125, term}), checkListAnnos(termFactory, f_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}