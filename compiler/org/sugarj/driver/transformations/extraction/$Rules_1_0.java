package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail733:
    { 
      IStrategoTerm i_424 = null;
      IStrategoTerm h_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail733;
      h_424 = term.getSubterm(0);
      IStrategoList annos5 = term.getAnnotations();
      i_424 = annos5;
      term = v_333.invoke(context, h_424);
      if(term == null)
        break Fail733;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}