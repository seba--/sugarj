package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail226:
    { 
      IStrategoTerm h_173 = null;
      IStrategoTerm g_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail226;
      g_173 = term.getSubterm(0);
      IStrategoList annos186 = term.getAnnotations();
      h_173 = annos186;
      term = e_40.invoke(context, g_173);
      if(term == null)
        break Fail226;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}