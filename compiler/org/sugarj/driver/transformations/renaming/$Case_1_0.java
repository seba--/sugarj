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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Case_1_0");
    Fail69:
    { 
      IStrategoTerm u_111 = null;
      IStrategoTerm t_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCase_1 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      t_111 = term.getSubterm(0);
      IStrategoList annos57 = term.getAnnotations();
      u_111 = annos57;
      term = w_18.invoke(context, t_111);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCase_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}