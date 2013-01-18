package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Invoke_2_0 extends Strategy 
{ 
  public static $Invoke_2_0 instance = new $Invoke_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_38, Strategy f_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Invoke_2_0");
    Fail184:
    { 
      IStrategoTerm h_167 = null;
      IStrategoTerm f_167 = null;
      IStrategoTerm g_167 = null;
      IStrategoTerm i_167 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      f_167 = term.getSubterm(0);
      g_167 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      h_167 = annos154;
      term = e_38.invoke(context, f_167);
      if(term == null)
        break Fail184;
      i_167 = term;
      term = f_38.invoke(context, g_167);
      if(term == null)
        break Fail184;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInvoke_2, new IStrategoTerm[]{i_167, term}), checkListAnnos(termFactory, h_167));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}