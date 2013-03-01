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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_37, Strategy p_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail172:
    { 
      IStrategoTerm i_165 = null;
      IStrategoTerm y_164 = null;
      IStrategoTerm d_165 = null;
      IStrategoTerm k_165 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      y_164 = term.getSubterm(0);
      d_165 = term.getSubterm(1);
      IStrategoList annos142 = term.getAnnotations();
      i_165 = annos142;
      term = o_37.invoke(context, y_164);
      if(term == null)
        break Fail172;
      k_165 = term;
      term = p_37.invoke(context, d_165);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMul_2, new IStrategoTerm[]{k_165, term}), checkListAnnos(termFactory, i_165));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}