package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Inject$Desugaring_4_0 extends Strategy 
{ 
  public static $Inject$Desugaring_4_0 instance = new $Inject$Desugaring_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_30, Strategy p_30, Strategy q_30, Strategy r_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail278:
    { 
      IStrategoTerm n_151 = null;
      IStrategoTerm i_151 = null;
      IStrategoTerm k_151 = null;
      IStrategoTerm l_151 = null;
      IStrategoTerm m_151 = null;
      IStrategoTerm o_151 = null;
      IStrategoTerm r_151 = null;
      IStrategoTerm s_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail278;
      i_151 = term.getSubterm(0);
      k_151 = term.getSubterm(1);
      l_151 = term.getSubterm(2);
      m_151 = term.getSubterm(3);
      IStrategoList annos233 = term.getAnnotations();
      n_151 = annos233;
      term = o_30.invoke(context, i_151);
      if(term == null)
        break Fail278;
      o_151 = term;
      term = p_30.invoke(context, k_151);
      if(term == null)
        break Fail278;
      r_151 = term;
      term = q_30.invoke(context, l_151);
      if(term == null)
        break Fail278;
      s_151 = term;
      term = r_30.invoke(context, m_151);
      if(term == null)
        break Fail278;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consInjectDesugaring_4, new IStrategoTerm[]{o_151, r_151, s_151, term}), checkListAnnos(termFactory, n_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}