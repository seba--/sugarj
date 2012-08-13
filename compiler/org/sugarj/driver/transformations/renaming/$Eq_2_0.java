package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_28, Strategy j_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail170:
    { 
      IStrategoTerm f_138 = null;
      IStrategoTerm d_138 = null;
      IStrategoTerm e_138 = null;
      IStrategoTerm g_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      d_138 = term.getSubterm(0);
      e_138 = term.getSubterm(1);
      IStrategoList annos145 = term.getAnnotations();
      f_138 = annos145;
      term = i_28.invoke(context, d_138);
      if(term == null)
        break Fail170;
      g_138 = term;
      term = j_28.invoke(context, e_138);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEq_2, new IStrategoTerm[]{g_138, term}), checkListAnnos(termFactory, f_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}