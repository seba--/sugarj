package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Refactoring_4_0 extends Strategy 
{ 
  public static $Refactoring_4_0 instance = new $Refactoring_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_334, Strategy a_335, Strategy b_335, Strategy c_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Refactoring_4_0");
    Fail758:
    { 
      IStrategoTerm s_427 = null;
      IStrategoTerm o_427 = null;
      IStrategoTerm p_427 = null;
      IStrategoTerm q_427 = null;
      IStrategoTerm r_427 = null;
      IStrategoTerm t_427 = null;
      IStrategoTerm u_427 = null;
      IStrategoTerm v_427 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRefactoring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail758;
      o_427 = term.getSubterm(0);
      p_427 = term.getSubterm(1);
      q_427 = term.getSubterm(2);
      r_427 = term.getSubterm(3);
      IStrategoList annos30 = term.getAnnotations();
      s_427 = annos30;
      term = z_334.invoke(context, o_427);
      if(term == null)
        break Fail758;
      t_427 = term;
      term = a_335.invoke(context, p_427);
      if(term == null)
        break Fail758;
      u_427 = term;
      term = b_335.invoke(context, q_427);
      if(term == null)
        break Fail758;
      v_427 = term;
      term = c_335.invoke(context, r_427);
      if(term == null)
        break Fail758;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRefactoring_4, new IStrategoTerm[]{t_427, u_427, v_427, term}), checkListAnnos(termFactory, s_427));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}