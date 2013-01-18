package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Or_2_0 extends Strategy 
{ 
  public static $Assign$Or_2_0 instance = new $Assign$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_35, Strategy h_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignOr_2_0");
    Fail142:
    { 
      IStrategoTerm k_156 = null;
      IStrategoTerm f_156 = null;
      IStrategoTerm g_156 = null;
      IStrategoTerm l_156 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      f_156 = term.getSubterm(0);
      g_156 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      k_156 = annos112;
      term = g_35.invoke(context, f_156);
      if(term == null)
        break Fail142;
      l_156 = term;
      term = h_35.invoke(context, g_156);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignOr_2, new IStrategoTerm[]{l_156, term}), checkListAnnos(termFactory, k_156));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}