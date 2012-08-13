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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_22, Strategy x_22, Strategy y_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumConst_3_0");
    Fail97:
    { 
      IStrategoTerm m_119 = null;
      IStrategoTerm j_119 = null;
      IStrategoTerm k_119 = null;
      IStrategoTerm l_119 = null;
      IStrategoTerm n_119 = null;
      IStrategoTerm o_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumConst_3 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      j_119 = term.getSubterm(0);
      k_119 = term.getSubterm(1);
      l_119 = term.getSubterm(2);
      IStrategoList annos78 = term.getAnnotations();
      m_119 = annos78;
      term = w_22.invoke(context, j_119);
      if(term == null)
        break Fail97;
      n_119 = term;
      term = x_22.invoke(context, k_119);
      if(term == null)
        break Fail97;
      o_119 = term;
      term = y_22.invoke(context, l_119);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumConst_3, new IStrategoTerm[]{n_119, o_119, term}), checkListAnnos(termFactory, m_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}