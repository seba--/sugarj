package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Array_3_0 extends Strategy 
{ 
  public static $New$Array_3_0 instance = new $New$Array_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_15, Strategy s_15, Strategy t_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewArray_3_0");
    Fail32:
    { 
      IStrategoTerm r_102 = null;
      IStrategoTerm o_102 = null;
      IStrategoTerm p_102 = null;
      IStrategoTerm q_102 = null;
      IStrategoTerm s_102 = null;
      IStrategoTerm t_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewArray_3 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      o_102 = term.getSubterm(0);
      p_102 = term.getSubterm(1);
      q_102 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      r_102 = annos20;
      term = r_15.invoke(context, o_102);
      if(term == null)
        break Fail32;
      s_102 = term;
      term = s_15.invoke(context, p_102);
      if(term == null)
        break Fail32;
      t_102 = term;
      term = t_15.invoke(context, q_102);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewArray_3, new IStrategoTerm[]{s_102, t_102, term}), checkListAnnos(termFactory, r_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}