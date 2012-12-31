package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_16, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail100:
    { 
      IStrategoTerm f_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm e_108 = null;
      IStrategoTerm g_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      d_108 = term.getSubterm(0);
      e_108 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      f_108 = annos93;
      term = j_16.invoke(context, d_108);
      if(term == null)
        break Fail100;
      g_108 = term;
      term = k_16.invoke(context, e_108);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScope_2, new IStrategoTerm[]{g_108, term}), checkListAnnos(termFactory, f_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}