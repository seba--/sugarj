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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17, Strategy a_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail130:
    { 
      IStrategoTerm q_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm p_112 = null;
      IStrategoTerm r_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      o_112 = term.getSubterm(0);
      p_112 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      q_112 = annos117;
      term = z_17.invoke(context, o_112);
      if(term == null)
        break Fail130;
      r_112 = term;
      term = a_18.invoke(context, p_112);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consApp_2, new IStrategoTerm[]{r_112, term}), checkListAnnos(termFactory, q_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}