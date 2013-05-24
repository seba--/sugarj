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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("transformation_elem_1_0");
    Fail737:
    { 
      IStrategoTerm w_424 = null;
      IStrategoTerm v_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail737;
      v_424 = term.getSubterm(0);
      IStrategoList annos9 = term.getAnnotations();
      w_424 = annos9;
      term = a_334.invoke(context, v_424);
      if(term == null)
        break Fail737;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._constransformation_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}