package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Desugarings_1_0 extends Strategy 
{ 
  public static $Desugarings_1_0 instance = new $Desugarings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Desugarings_1_0");
    Fail28:
    { 
      IStrategoTerm o_106 = null;
      IStrategoTerm n_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      n_106 = term.getSubterm(0);
      IStrategoList annos10 = term.getAnnotations();
      o_106 = annos10;
      term = g_18.invoke(context, n_106);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDesugarings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}