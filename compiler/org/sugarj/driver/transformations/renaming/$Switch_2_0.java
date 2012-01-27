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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_19, Strategy y_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Switch_2_0");
    Fail83:
    { 
      IStrategoTerm o_114 = null;
      IStrategoTerm m_114 = null;
      IStrategoTerm n_114 = null;
      IStrategoTerm p_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      m_114 = term.getSubterm(0);
      n_114 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      o_114 = annos71;
      term = x_19.invoke(context, m_114);
      if(term == null)
        break Fail83;
      p_114 = term;
      term = y_19.invoke(context, n_114);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitch_2, new IStrategoTerm[]{p_114, term}), checkListAnnos(termFactory, o_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}