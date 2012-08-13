package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$And_2_0 extends Strategy 
{ 
  public static $Assign$And_2_0 instance = new $Assign$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_27, Strategy d_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignAnd_2_0");
    Fail154:
    { 
      IStrategoTerm h_132 = null;
      IStrategoTerm f_132 = null;
      IStrategoTerm g_132 = null;
      IStrategoTerm i_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      f_132 = term.getSubterm(0);
      g_132 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      h_132 = annos129;
      term = c_27.invoke(context, f_132);
      if(term == null)
        break Fail154;
      i_132 = term;
      term = d_27.invoke(context, g_132);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignAnd_2, new IStrategoTerm[]{i_132, term}), checkListAnnos(termFactory, h_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}