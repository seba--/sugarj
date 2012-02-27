package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Const_3_0 extends Strategy 
{ 
  public static $Enum$Const_3_0 instance = new $Enum$Const_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17, Strategy u_17, Strategy v_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumConst_3_0");
    Fail51:
    { 
      IStrategoTerm p_107 = null;
      IStrategoTerm j_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumConst_3 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      j_107 = term.getSubterm(0);
      k_107 = term.getSubterm(1);
      o_107 = term.getSubterm(2);
      IStrategoList annos37 = term.getAnnotations();
      p_107 = annos37;
      term = t_17.invoke(context, j_107);
      if(term == null)
        break Fail51;
      q_107 = term;
      term = u_17.invoke(context, k_107);
      if(term == null)
        break Fail51;
      r_107 = term;
      term = v_17.invoke(context, o_107);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumConst_3, new IStrategoTerm[]{q_107, r_107, term}), checkListAnnos(termFactory, p_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}