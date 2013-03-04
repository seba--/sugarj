package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26, Strategy q_26, Strategy r_26, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail28:
    { 
      IStrategoTerm n_124 = null;
      IStrategoTerm d_124 = null;
      IStrategoTerm e_124 = null;
      IStrategoTerm g_124 = null;
      IStrategoTerm j_124 = null;
      IStrategoTerm o_124 = null;
      IStrategoTerm p_124 = null;
      IStrategoTerm q_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      d_124 = term.getSubterm(0);
      e_124 = term.getSubterm(1);
      g_124 = term.getSubterm(2);
      j_124 = term.getSubterm(3);
      IStrategoList annos5 = term.getAnnotations();
      n_124 = annos5;
      term = p_26.invoke(context, d_124);
      if(term == null)
        break Fail28;
      o_124 = term;
      term = q_26.invoke(context, e_124);
      if(term == null)
        break Fail28;
      p_124 = term;
      term = r_26.invoke(context, g_124);
      if(term == null)
        break Fail28;
      q_124 = term;
      term = s_26.invoke(context, j_124);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInjectDesugaring_4, new IStrategoTerm[]{o_124, p_124, q_124, term}), checkListAnnos(termFactory, n_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}