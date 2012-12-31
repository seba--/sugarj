package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Case_2_0 extends Strategy 
{ 
  public static $Switch$Case_2_0 instance = new $Switch$Case_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_42, Strategy p_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail274:
    { 
      IStrategoTerm h_180 = null;
      IStrategoTerm f_180 = null;
      IStrategoTerm g_180 = null;
      IStrategoTerm i_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail274;
      f_180 = term.getSubterm(0);
      g_180 = term.getSubterm(1);
      IStrategoList annos221 = term.getAnnotations();
      h_180 = annos221;
      term = o_42.invoke(context, f_180);
      if(term == null)
        break Fail274;
      i_180 = term;
      term = p_42.invoke(context, g_180);
      if(term == null)
        break Fail274;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchCase_2, new IStrategoTerm[]{i_180, term}), checkListAnnos(termFactory, h_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}