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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("transformation_elem_1_0");
    Fail46:
    { 
      IStrategoTerm w_108 = null;
      IStrategoTerm v_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      v_108 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      w_108 = annos28;
      term = y_18.invoke(context, v_108);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._constransformation_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}