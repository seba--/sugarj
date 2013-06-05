package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim_2_0 extends Strategy 
{ 
  public static $Prim_2_0 instance = new $Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_21, Strategy t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail112:
    { 
      IStrategoTerm t_118 = null;
      IStrategoTerm r_118 = null;
      IStrategoTerm s_118 = null;
      IStrategoTerm u_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      r_118 = term.getSubterm(0);
      s_118 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      t_118 = annos84;
      term = s_21.invoke(context, r_118);
      if(term == null)
        break Fail112;
      u_118 = term;
      term = t_21.invoke(context, s_118);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consPrim_2, new IStrategoTerm[]{u_118, term}), checkListAnnos(termFactory, t_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}