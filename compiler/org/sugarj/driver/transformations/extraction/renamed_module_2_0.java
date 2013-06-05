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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_26, Strategy t_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamed_module_2_0");
    Fail211:
    { 
      IStrategoTerm g_137 = null;
      IStrategoTerm d_137 = null;
      IStrategoTerm f_137 = null;
      IStrategoTerm h_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consrenamed_module_2 != ((IStrategoAppl)term).getConstructor())
        break Fail211;
      d_137 = term.getSubterm(0);
      f_137 = term.getSubterm(1);
      IStrategoList annos171 = term.getAnnotations();
      g_137 = annos171;
      term = s_26.invoke(context, d_137);
      if(term == null)
        break Fail211;
      h_137 = term;
      term = t_26.invoke(context, f_137);
      if(term == null)
        break Fail211;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consrenamed_module_2, new IStrategoTerm[]{h_137, term}), checkListAnnos(termFactory, g_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}