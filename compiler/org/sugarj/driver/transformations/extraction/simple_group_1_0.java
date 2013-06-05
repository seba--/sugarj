package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_group_1_0 extends Strategy 
{ 
  public static simple_group_1_0 instance = new simple_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_group_1_0");
    Fail203:
    { 
      IStrategoTerm n_136 = null;
      IStrategoTerm m_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssimple_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail203;
      m_136 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      n_136 = annos167;
      term = n_26.invoke(context, m_136);
      if(term == null)
        break Fail203;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssimple_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}