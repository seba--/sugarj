package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_14, Strategy p_14, Strategy q_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail69:
    { 
      IStrategoTerm t_102 = null;
      IStrategoTerm q_102 = null;
      IStrategoTerm r_102 = null;
      IStrategoTerm s_102 = null;
      IStrategoTerm u_102 = null;
      IStrategoTerm v_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      q_102 = term.getSubterm(0);
      r_102 = term.getSubterm(1);
      s_102 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      t_102 = annos60;
      term = o_14.invoke(context, q_102);
      if(term == null)
        break Fail69;
      u_102 = term;
      term = p_14.invoke(context, r_102);
      if(term == null)
        break Fail69;
      v_102 = term;
      term = q_14.invoke(context, s_102);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCondChoice_3, new IStrategoTerm[]{u_102, v_102, term}), checkListAnnos(termFactory, t_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}