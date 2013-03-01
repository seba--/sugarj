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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_31, Strategy f_31, Strategy g_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumConst_3_0");
    Fail87:
    { 
      IStrategoTerm l_141 = null;
      IStrategoTerm f_141 = null;
      IStrategoTerm g_141 = null;
      IStrategoTerm k_141 = null;
      IStrategoTerm v_141 = null;
      IStrategoTerm x_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEnumConst_3 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      f_141 = term.getSubterm(0);
      g_141 = term.getSubterm(1);
      k_141 = term.getSubterm(2);
      IStrategoList annos63 = term.getAnnotations();
      l_141 = annos63;
      term = e_31.invoke(context, f_141);
      if(term == null)
        break Fail87;
      v_141 = term;
      term = f_31.invoke(context, g_141);
      if(term == null)
        break Fail87;
      x_141 = term;
      term = g_31.invoke(context, k_141);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEnumConst_3, new IStrategoTerm[]{v_141, x_141, term}), checkListAnnos(termFactory, l_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}