package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch_2_0 extends Strategy 
{ 
  public static $Switch_2_0 instance = new $Switch_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_34, Strategy g_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Switch_2_0");
    Fail124:
    { 
      IStrategoTerm j_151 = null;
      IStrategoTerm h_151 = null;
      IStrategoTerm i_151 = null;
      IStrategoTerm k_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      h_151 = term.getSubterm(0);
      i_151 = term.getSubterm(1);
      IStrategoList annos97 = term.getAnnotations();
      j_151 = annos97;
      term = f_34.invoke(context, h_151);
      if(term == null)
        break Fail124;
      k_151 = term;
      term = g_34.invoke(context, i_151);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitch_2, new IStrategoTerm[]{k_151, term}), checkListAnnos(termFactory, j_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}