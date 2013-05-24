package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail916:
    { 
      IStrategoTerm i_450 = null;
      IStrategoTerm h_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail916;
      h_450 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      i_450 = annos161;
      term = z_343.invoke(context, h_450);
      if(term == null)
        break Fail916;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}