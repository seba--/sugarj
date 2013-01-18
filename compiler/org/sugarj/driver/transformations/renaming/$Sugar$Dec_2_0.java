package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec_2_0 extends Strategy 
{ 
  public static $Sugar$Dec_2_0 instance = new $Sugar$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27, Strategy b_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDec_2_0");
    Fail33:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm o_125 = null;
      IStrategoTerm p_125 = null;
      IStrategoTerm r_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSugarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      o_125 = term.getSubterm(0);
      p_125 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      q_125 = annos10;
      term = a_27.invoke(context, o_125);
      if(term == null)
        break Fail33;
      r_125 = term;
      term = b_27.invoke(context, p_125);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSugarDec_2, new IStrategoTerm[]{r_125, term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}