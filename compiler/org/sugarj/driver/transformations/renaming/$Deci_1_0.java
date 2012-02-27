package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Deci_1_0 extends Strategy 
{ 
  public static $Deci_1_0 instance = new $Deci_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Deci_1_0");
    Fail197:
    { 
      IStrategoTerm q_136 = null;
      IStrategoTerm o_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeci_1 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      o_136 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      q_136 = annos165;
      term = y_26.invoke(context, o_136);
      if(term == null)
        break Fail197;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeci_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}