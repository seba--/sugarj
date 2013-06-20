package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("transformation_elem_1_0");
    Fail29:
    { 
      IStrategoTerm r_102 = null;
      IStrategoTerm q_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      q_102 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      r_102 = annos2;
      term = w_15.invoke(context, q_102);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._constransformation_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}