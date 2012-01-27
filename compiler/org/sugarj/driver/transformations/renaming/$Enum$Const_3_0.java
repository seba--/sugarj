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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_16, Strategy x_16, Strategy y_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumConst_3_0");
    Fail46:
    { 
      IStrategoTerm l_106 = null;
      IStrategoTerm i_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm k_106 = null;
      IStrategoTerm m_106 = null;
      IStrategoTerm n_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumConst_3 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      i_106 = term.getSubterm(0);
      j_106 = term.getSubterm(1);
      k_106 = term.getSubterm(2);
      IStrategoList annos37 = term.getAnnotations();
      l_106 = annos37;
      term = w_16.invoke(context, i_106);
      if(term == null)
        break Fail46;
      m_106 = term;
      term = x_16.invoke(context, j_106);
      if(term == null)
        break Fail46;
      n_106 = term;
      term = y_16.invoke(context, k_106);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumConst_3, new IStrategoTerm[]{m_106, n_106, term}), checkListAnnos(termFactory, l_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}