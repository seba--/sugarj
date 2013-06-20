package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_2_0 extends Strategy 
{ 
  public static $Var$Dec_2_0 instance = new $Var$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_12, Strategy s_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail50:
    { 
      IStrategoTerm s_97 = null;
      IStrategoTerm q_97 = null;
      IStrategoTerm r_97 = null;
      IStrategoTerm t_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      q_97 = term.getSubterm(0);
      r_97 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      s_97 = annos41;
      term = r_12.invoke(context, q_97);
      if(term == null)
        break Fail50;
      t_97 = term;
      term = s_12.invoke(context, r_97);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_2, new IStrategoTerm[]{t_97, term}), checkListAnnos(termFactory, s_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}