package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Dec_1_0 extends Strategy 
{ 
  public static $Super$Dec_1_0 instance = new $Super$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperDec_1_0");
    Fail36:
    { 
      IStrategoTerm h_103 = null;
      IStrategoTerm g_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      g_103 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      h_103 = annos22;
      term = d_16.invoke(context, g_103);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}