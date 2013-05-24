package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class diff_2_0 extends Strategy 
{ 
  public static diff_2_0 instance = new diff_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_349, Strategy q_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("diff_2_0");
    Fail1020:
    { 
      IStrategoTerm c_465 = null;
      IStrategoTerm a_465 = null;
      IStrategoTerm b_465 = null;
      IStrategoTerm d_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consdiff_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1020;
      a_465 = term.getSubterm(0);
      b_465 = term.getSubterm(1);
      IStrategoList annos252 = term.getAnnotations();
      c_465 = annos252;
      term = p_349.invoke(context, a_465);
      if(term == null)
        break Fail1020;
      d_465 = term;
      term = q_349.invoke(context, b_465);
      if(term == null)
        break Fail1020;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consdiff_2, new IStrategoTerm[]{d_465, term}), checkListAnnos(termFactory, c_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}