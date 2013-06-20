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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_25, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("diff_2_0");
    Fail187:
    { 
      IStrategoTerm i_132 = null;
      IStrategoTerm g_132 = null;
      IStrategoTerm h_132 = null;
      IStrategoTerm j_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consdiff_2 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      g_132 = term.getSubterm(0);
      h_132 = term.getSubterm(1);
      IStrategoList annos156 = term.getAnnotations();
      i_132 = annos156;
      term = x_25.invoke(context, g_132);
      if(term == null)
        break Fail187;
      j_132 = term;
      term = y_25.invoke(context, h_132);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consdiff_2, new IStrategoTerm[]{j_132, term}), checkListAnnos(termFactory, i_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}