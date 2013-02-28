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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_17, Strategy x_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail131:
    { 
      IStrategoTerm n_112 = null;
      IStrategoTerm l_112 = null;
      IStrategoTerm m_112 = null;
      IStrategoTerm o_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      l_112 = term.getSubterm(0);
      m_112 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      n_112 = annos117;
      term = w_17.invoke(context, l_112);
      if(term == null)
        break Fail131;
      o_112 = term;
      term = x_17.invoke(context, m_112);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consApp_2, new IStrategoTerm[]{o_112, term}), checkListAnnos(termFactory, n_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}