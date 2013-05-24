package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Builder_3_0 extends Strategy 
{ 
  public static $Builder_3_0 instance = new $Builder_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_335, Strategy h_335, Strategy i_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Builder_3_0");
    Fail761:
    { 
      IStrategoTerm i_428 = null;
      IStrategoTerm f_428 = null;
      IStrategoTerm g_428 = null;
      IStrategoTerm h_428 = null;
      IStrategoTerm j_428 = null;
      IStrategoTerm k_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuilder_3 != ((IStrategoAppl)term).getConstructor())
        break Fail761;
      f_428 = term.getSubterm(0);
      g_428 = term.getSubterm(1);
      h_428 = term.getSubterm(2);
      IStrategoList annos33 = term.getAnnotations();
      i_428 = annos33;
      term = g_335.invoke(context, f_428);
      if(term == null)
        break Fail761;
      j_428 = term;
      term = h_335.invoke(context, g_428);
      if(term == null)
        break Fail761;
      k_428 = term;
      term = i_335.invoke(context, h_428);
      if(term == null)
        break Fail761;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuilder_3, new IStrategoTerm[]{j_428, k_428, term}), checkListAnnos(termFactory, i_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}