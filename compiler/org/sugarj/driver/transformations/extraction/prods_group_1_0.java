package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prods_group_1_0 extends Strategy 
{ 
  public static prods_group_1_0 instance = new prods_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prods_group_1_0");
    Fail202:
    { 
      IStrategoTerm k_136 = null;
      IStrategoTerm j_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consprods_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      j_136 = term.getSubterm(0);
      IStrategoList annos166 = term.getAnnotations();
      k_136 = annos166;
      term = m_26.invoke(context, j_136);
      if(term == null)
        break Fail202;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consprods_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}