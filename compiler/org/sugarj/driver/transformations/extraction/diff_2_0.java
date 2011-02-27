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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_25, Strategy x_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("diff_2_0");
    Fail174:
    { 
      IStrategoTerm a_132 = null;
      IStrategoTerm x_131 = null;
      IStrategoTerm z_131 = null;
      IStrategoTerm b_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consdiff_2 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      x_131 = term.getSubterm(0);
      z_131 = term.getSubterm(1);
      IStrategoList annos147 = term.getAnnotations();
      a_132 = annos147;
      term = w_25.invoke(context, x_131);
      if(term == null)
        break Fail174;
      b_132 = term;
      term = x_25.invoke(context, z_131);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consdiff_2, new IStrategoTerm[]{b_132, term}), checkListAnnos(termFactory, a_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}