package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class label_2_0 extends Strategy 
{ 
  public static label_2_0 instance = new label_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_27, Strategy l_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("label_2_0");
    Fail212:
    { 
      IStrategoTerm c_139 = null;
      IStrategoTerm a_139 = null;
      IStrategoTerm b_139 = null;
      IStrategoTerm d_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      a_139 = term.getSubterm(0);
      b_139 = term.getSubterm(1);
      IStrategoList annos174 = term.getAnnotations();
      c_139 = annos174;
      term = k_27.invoke(context, a_139);
      if(term == null)
        break Fail212;
      d_139 = term;
      term = l_27.invoke(context, b_139);
      if(term == null)
        break Fail212;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslabel_2, new IStrategoTerm[]{d_139, term}), checkListAnnos(termFactory, c_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}