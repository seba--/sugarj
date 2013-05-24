package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamed_module_2_0 extends Strategy 
{ 
  public static renamed_module_2_0 instance = new renamed_module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_351, Strategy o_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamed_module_2_0");
    Fail1058:
    { 
      IStrategoTerm f_470 = null;
      IStrategoTerm d_470 = null;
      IStrategoTerm e_470 = null;
      IStrategoTerm g_470 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consrenamed_module_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1058;
      d_470 = term.getSubterm(0);
      e_470 = term.getSubterm(1);
      IStrategoList annos285 = term.getAnnotations();
      f_470 = annos285;
      term = n_351.invoke(context, d_470);
      if(term == null)
        break Fail1058;
      g_470 = term;
      term = o_351.invoke(context, e_470);
      if(term == null)
        break Fail1058;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consrenamed_module_2, new IStrategoTerm[]{g_470, term}), checkListAnnos(termFactory, f_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}