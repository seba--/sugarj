package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_23, Strategy g_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail137:
    { 
      IStrategoTerm i_123 = null;
      IStrategoTerm g_123 = null;
      IStrategoTerm h_123 = null;
      IStrategoTerm j_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      g_123 = term.getSubterm(0);
      h_123 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      i_123 = annos107;
      term = f_23.invoke(context, g_123);
      if(term == null)
        break Fail137;
      j_123 = term;
      term = g_23.invoke(context, h_123);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consLet_2, new IStrategoTerm[]{j_123, term}), checkListAnnos(termFactory, i_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}