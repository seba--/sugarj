package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim_2_0 extends Strategy 
{ 
  public static $Prim_2_0 instance = new $Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_15, Strategy o_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail86:
    { 
      IStrategoTerm j_105 = null;
      IStrategoTerm h_105 = null;
      IStrategoTerm i_105 = null;
      IStrategoTerm k_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      h_105 = term.getSubterm(0);
      i_105 = term.getSubterm(1);
      IStrategoList annos76 = term.getAnnotations();
      j_105 = annos76;
      term = n_15.invoke(context, h_105);
      if(term == null)
        break Fail86;
      k_105 = term;
      term = o_15.invoke(context, i_105);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrim_2, new IStrategoTerm[]{k_105, term}), checkListAnnos(termFactory, j_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}