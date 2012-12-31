package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$Dec_2_0 extends Strategy 
{ 
  public static $Trans$Dec_2_0 instance = new $Trans$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_27, Strategy v_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransDec_2_0");
    Fail44:
    { 
      IStrategoTerm s_127 = null;
      IStrategoTerm q_127 = null;
      IStrategoTerm r_127 = null;
      IStrategoTerm t_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTransDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      q_127 = term.getSubterm(0);
      r_127 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      s_127 = annos21;
      term = u_27.invoke(context, q_127);
      if(term == null)
        break Fail44;
      t_127 = term;
      term = v_27.invoke(context, r_127);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTransDec_2, new IStrategoTerm[]{t_127, term}), checkListAnnos(termFactory, s_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}