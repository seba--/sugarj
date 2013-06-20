package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_20, Strategy l_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail91:
    { 
      IStrategoTerm i_115 = null;
      IStrategoTerm g_115 = null;
      IStrategoTerm h_115 = null;
      IStrategoTerm j_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      g_115 = term.getSubterm(0);
      h_115 = term.getSubterm(1);
      IStrategoList annos64 = term.getAnnotations();
      i_115 = annos64;
      term = k_20.invoke(context, g_115);
      if(term == null)
        break Fail91;
      j_115 = term;
      term = l_20.invoke(context, h_115);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAssign_2, new IStrategoTerm[]{j_115, term}), checkListAnnos(termFactory, i_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}