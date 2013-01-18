package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec_2_0 extends Strategy 
{ 
  public static $Constr$Dec_2_0 instance = new $Constr$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_32, Strategy d_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDec_2_0");
    Fail96:
    { 
      IStrategoTerm t_144 = null;
      IStrategoTerm r_144 = null;
      IStrategoTerm s_144 = null;
      IStrategoTerm u_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstrDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      r_144 = term.getSubterm(0);
      s_144 = term.getSubterm(1);
      IStrategoList annos72 = term.getAnnotations();
      t_144 = annos72;
      term = c_32.invoke(context, r_144);
      if(term == null)
        break Fail96;
      u_144 = term;
      term = d_32.invoke(context, s_144);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstrDec_2, new IStrategoTerm[]{u_144, term}), checkListAnnos(termFactory, t_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}