package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_2_0 extends Strategy 
{ 
  public static $Amb$Name_2_0 instance = new $Amb$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_26, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_2_0");
    Fail175:
    { 
      IStrategoTerm k_133 = null;
      IStrategoTerm h_133 = null;
      IStrategoTerm j_133 = null;
      IStrategoTerm l_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      h_133 = term.getSubterm(0);
      j_133 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      k_133 = annos154;
      term = m_26.invoke(context, h_133);
      if(term == null)
        break Fail175;
      l_133 = term;
      term = n_26.invoke(context, j_133);
      if(term == null)
        break Fail175;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_2, new IStrategoTerm[]{l_133, term}), checkListAnnos(termFactory, k_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}