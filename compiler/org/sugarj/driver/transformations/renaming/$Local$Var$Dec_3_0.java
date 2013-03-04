package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec_3_0 extends Strategy 
{ 
  public static $Local$Var$Dec_3_0 instance = new $Local$Var$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_34, Strategy t_34, Strategy u_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDec_3_0");
    Fail132:
    { 
      IStrategoTerm j_154 = null;
      IStrategoTerm d_154 = null;
      IStrategoTerm e_154 = null;
      IStrategoTerm f_154 = null;
      IStrategoTerm k_154 = null;
      IStrategoTerm l_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      d_154 = term.getSubterm(0);
      e_154 = term.getSubterm(1);
      f_154 = term.getSubterm(2);
      IStrategoList annos104 = term.getAnnotations();
      j_154 = annos104;
      term = s_34.invoke(context, d_154);
      if(term == null)
        break Fail132;
      k_154 = term;
      term = t_34.invoke(context, e_154);
      if(term == null)
        break Fail132;
      l_154 = term;
      term = u_34.invoke(context, f_154);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLocalVarDec_3, new IStrategoTerm[]{k_154, l_154, term}), checkListAnnos(termFactory, j_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}