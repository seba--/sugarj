package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Native$Sugar$Dec$Head_3_0 extends Strategy 
{ 
  public static $Native$Sugar$Dec$Head_3_0 instance = new $Native$Sugar$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_30, Strategy e_30, Strategy f_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NativeSugarDecHead_3_0");
    Fail274:
    { 
      IStrategoTerm i_150 = null;
      IStrategoTerm f_150 = null;
      IStrategoTerm g_150 = null;
      IStrategoTerm h_150 = null;
      IStrategoTerm j_150 = null;
      IStrategoTerm k_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consNativeSugarDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail274;
      f_150 = term.getSubterm(0);
      g_150 = term.getSubterm(1);
      h_150 = term.getSubterm(2);
      IStrategoList annos228 = term.getAnnotations();
      i_150 = annos228;
      term = d_30.invoke(context, f_150);
      if(term == null)
        break Fail274;
      j_150 = term;
      term = e_30.invoke(context, g_150);
      if(term == null)
        break Fail274;
      k_150 = term;
      term = f_30.invoke(context, h_150);
      if(term == null)
        break Fail274;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consNativeSugarDecHead_3, new IStrategoTerm[]{j_150, k_150, term}), checkListAnnos(termFactory, i_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}