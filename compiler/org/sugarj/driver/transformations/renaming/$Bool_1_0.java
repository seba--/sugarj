package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Bool_1_0 extends Strategy 
{ 
  public static $Bool_1_0 instance = new $Bool_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Bool_1_0");
    Fail229:
    { 
      IStrategoTerm k_173 = null;
      IStrategoTerm j_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail229;
      j_173 = term.getSubterm(0);
      IStrategoList annos187 = term.getAnnotations();
      k_173 = annos187;
      term = f_40.invoke(context, j_173);
      if(term == null)
        break Fail229;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBool_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}