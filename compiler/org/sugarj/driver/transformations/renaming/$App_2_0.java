package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $App_2_0 extends Strategy 
{ 
  public static $App_2_0 instance = new $App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_48, Strategy i_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail365:
    { 
      IStrategoTerm q_196 = null;
      IStrategoTerm o_196 = null;
      IStrategoTerm p_196 = null;
      IStrategoTerm r_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail365;
      o_196 = term.getSubterm(0);
      p_196 = term.getSubterm(1);
      IStrategoList annos308 = term.getAnnotations();
      q_196 = annos308;
      term = h_48.invoke(context, o_196);
      if(term == null)
        break Fail365;
      r_196 = term;
      term = i_48.invoke(context, p_196);
      if(term == null)
        break Fail365;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consApp_2, new IStrategoTerm[]{r_196, term}), checkListAnnos(termFactory, q_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}