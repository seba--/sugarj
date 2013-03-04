package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class transformation_elem_1_0 extends Strategy 
{ 
  public static transformation_elem_1_0 instance = new transformation_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("transformation_elem_1_0");
    Fail25:
    { 
      IStrategoTerm u_123 = null;
      IStrategoTerm t_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      t_123 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      u_123 = annos2;
      term = m_26.invoke(context, t_123);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._constransformation_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}