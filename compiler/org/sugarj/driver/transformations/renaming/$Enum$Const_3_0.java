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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_17, Strategy m_17, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumConst_3_0");
    Fail49:
    { 
      IStrategoTerm c_107 = null;
      IStrategoTerm z_106 = null;
      IStrategoTerm a_107 = null;
      IStrategoTerm b_107 = null;
      IStrategoTerm d_107 = null;
      IStrategoTerm e_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumConst_3 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      z_106 = term.getSubterm(0);
      a_107 = term.getSubterm(1);
      b_107 = term.getSubterm(2);
      IStrategoList annos37 = term.getAnnotations();
      c_107 = annos37;
      term = l_17.invoke(context, z_106);
      if(term == null)
        break Fail49;
      d_107 = term;
      term = m_17.invoke(context, a_107);
      if(term == null)
        break Fail49;
      e_107 = term;
      term = n_17.invoke(context, b_107);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumConst_3, new IStrategoTerm[]{d_107, e_107, term}), checkListAnnos(termFactory, c_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}