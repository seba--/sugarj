package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_46, Strategy f_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail328:
    { 
      IStrategoTerm h_190 = null;
      IStrategoTerm f_190 = null;
      IStrategoTerm g_190 = null;
      IStrategoTerm i_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail328;
      f_190 = term.getSubterm(0);
      g_190 = term.getSubterm(1);
      IStrategoList annos274 = term.getAnnotations();
      h_190 = annos274;
      term = e_46.invoke(context, f_190);
      if(term == null)
        break Fail328;
      i_190 = term;
      term = f_46.invoke(context, g_190);
      if(term == null)
        break Fail328;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLChoice_2, new IStrategoTerm[]{i_190, term}), checkListAnnos(termFactory, h_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}