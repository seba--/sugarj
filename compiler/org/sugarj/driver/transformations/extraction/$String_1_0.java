package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail843:
    { 
      IStrategoTerm r_437 = null;
      IStrategoTerm q_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail843;
      q_437 = term.getSubterm(0);
      IStrategoList annos90 = term.getAnnotations();
      r_437 = annos90;
      term = a_339.invoke(context, q_437);
      if(term == null)
        break Fail843;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}