package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Refactorings_2_0 extends Strategy 
{ 
  public static $Refactorings_2_0 instance = new $Refactorings_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_334, Strategy w_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Refactorings_2_0");
    Fail755:
    { 
      IStrategoTerm f_427 = null;
      IStrategoTerm d_427 = null;
      IStrategoTerm e_427 = null;
      IStrategoTerm g_427 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRefactorings_2 != ((IStrategoAppl)term).getConstructor())
        break Fail755;
      d_427 = term.getSubterm(0);
      e_427 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      f_427 = annos27;
      term = v_334.invoke(context, d_427);
      if(term == null)
        break Fail755;
      g_427 = term;
      term = w_334.invoke(context, e_427);
      if(term == null)
        break Fail755;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRefactorings_2, new IStrategoTerm[]{g_427, term}), checkListAnnos(termFactory, f_427));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}