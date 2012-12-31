package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throws$Dec_1_0 extends Strategy 
{ 
  public static $Throws$Dec_1_0 instance = new $Throws$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ThrowsDec_1_0");
    Fail100:
    { 
      IStrategoTerm i_145 = null;
      IStrategoTerm h_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consThrowsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      h_145 = term.getSubterm(0);
      IStrategoList annos75 = term.getAnnotations();
      i_145 = annos75;
      term = g_32.invoke(context, h_145);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consThrowsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}