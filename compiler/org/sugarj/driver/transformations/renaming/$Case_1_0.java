package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Case_1_0 extends Strategy 
{ 
  public static $Case_1_0 instance = new $Case_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Case_1_0");
    Fail110:
    { 
      IStrategoTerm q_148 = null;
      IStrategoTerm p_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCase_1 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      p_148 = term.getSubterm(0);
      IStrategoList annos83 = term.getAnnotations();
      q_148 = annos83;
      term = e_33.invoke(context, p_148);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCase_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}