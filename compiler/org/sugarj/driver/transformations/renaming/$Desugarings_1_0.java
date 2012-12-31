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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Desugarings_1_0");
    Fail27:
    { 
      IStrategoTerm b_124 = null;
      IStrategoTerm z_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      z_123 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      b_124 = annos4;
      term = o_26.invoke(context, z_123);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDesugarings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}