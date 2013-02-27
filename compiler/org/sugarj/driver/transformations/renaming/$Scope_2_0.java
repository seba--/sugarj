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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_16, Strategy j_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail104:
    { 
      IStrategoTerm e_108 = null;
      IStrategoTerm c_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm f_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      c_108 = term.getSubterm(0);
      d_108 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      e_108 = annos93;
      term = i_16.invoke(context, c_108);
      if(term == null)
        break Fail104;
      f_108 = term;
      term = j_16.invoke(context, d_108);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScope_2, new IStrategoTerm[]{f_108, term}), checkListAnnos(termFactory, e_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}