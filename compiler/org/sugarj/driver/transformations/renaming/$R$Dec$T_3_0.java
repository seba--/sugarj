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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_40, Strategy o_40, Strategy p_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail248:
    { 
      IStrategoTerm r_174 = null;
      IStrategoTerm o_174 = null;
      IStrategoTerm p_174 = null;
      IStrategoTerm q_174 = null;
      IStrategoTerm s_174 = null;
      IStrategoTerm t_174 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail248;
      o_174 = term.getSubterm(0);
      p_174 = term.getSubterm(1);
      q_174 = term.getSubterm(2);
      IStrategoList annos195 = term.getAnnotations();
      r_174 = annos195;
      term = n_40.invoke(context, o_174);
      if(term == null)
        break Fail248;
      s_174 = term;
      term = o_40.invoke(context, p_174);
      if(term == null)
        break Fail248;
      t_174 = term;
      term = p_40.invoke(context, q_174);
      if(term == null)
        break Fail248;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecT_3, new IStrategoTerm[]{s_174, t_174, term}), checkListAnnos(termFactory, r_174));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}