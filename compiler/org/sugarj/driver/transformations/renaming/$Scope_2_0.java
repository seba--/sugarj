package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_46, Strategy x_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail338:
    { 
      IStrategoTerm i_192 = null;
      IStrategoTerm g_192 = null;
      IStrategoTerm h_192 = null;
      IStrategoTerm j_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail338;
      g_192 = term.getSubterm(0);
      h_192 = term.getSubterm(1);
      IStrategoList annos284 = term.getAnnotations();
      i_192 = annos284;
      term = w_46.invoke(context, g_192);
      if(term == null)
        break Fail338;
      j_192 = term;
      term = x_46.invoke(context, h_192);
      if(term == null)
        break Fail338;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScope_2, new IStrategoTerm[]{j_192, term}), checkListAnnos(termFactory, i_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}