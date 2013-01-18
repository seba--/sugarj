package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Model$Body_1_0 extends Strategy 
{ 
  public static $Model$Body_1_0 instance = new $Model$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelBody_1_0");
    Fail43:
    { 
      IStrategoTerm o_127 = null;
      IStrategoTerm n_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModelBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      n_127 = term.getSubterm(0);
      IStrategoList annos20 = term.getAnnotations();
      o_127 = annos20;
      term = t_27.invoke(context, n_127);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModelBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}