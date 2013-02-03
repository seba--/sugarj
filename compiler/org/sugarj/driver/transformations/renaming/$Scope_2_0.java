package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_16, Strategy p_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail103:
    { 
      IStrategoTerm k_108 = null;
      IStrategoTerm i_108 = null;
      IStrategoTerm j_108 = null;
      IStrategoTerm l_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      i_108 = term.getSubterm(0);
      j_108 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      k_108 = annos93;
      term = o_16.invoke(context, i_108);
      if(term == null)
        break Fail103;
      l_108 = term;
      term = p_16.invoke(context, j_108);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScope_2, new IStrategoTerm[]{l_108, term}), checkListAnnos(termFactory, k_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}