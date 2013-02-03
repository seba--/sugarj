package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$T_3_0 extends Strategy 
{ 
  public static $R$Dec$T_3_0 instance = new $R$Dec$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_10, Strategy b_10, Strategy c_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail10:
    { 
      IStrategoTerm i_89 = null;
      IStrategoTerm c_89 = null;
      IStrategoTerm f_89 = null;
      IStrategoTerm g_89 = null;
      IStrategoTerm j_89 = null;
      IStrategoTerm k_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail10;
      c_89 = term.getSubterm(0);
      f_89 = term.getSubterm(1);
      g_89 = term.getSubterm(2);
      IStrategoList annos1 = term.getAnnotations();
      i_89 = annos1;
      term = a_10.invoke(context, c_89);
      if(term == null)
        break Fail10;
      j_89 = term;
      term = b_10.invoke(context, f_89);
      if(term == null)
        break Fail10;
      k_89 = term;
      term = c_10.invoke(context, g_89);
      if(term == null)
        break Fail10;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecT_3, new IStrategoTerm[]{j_89, k_89, term}), checkListAnnos(termFactory, i_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}