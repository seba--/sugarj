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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17, Strategy u_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail131:
    { 
      IStrategoTerm k_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm j_112 = null;
      IStrategoTerm l_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      i_112 = term.getSubterm(0);
      j_112 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      k_112 = annos117;
      term = t_17.invoke(context, i_112);
      if(term == null)
        break Fail131;
      l_112 = term;
      term = u_17.invoke(context, j_112);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consApp_2, new IStrategoTerm[]{l_112, term}), checkListAnnos(termFactory, k_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}