package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec$Head_2_0 extends Strategy 
{ 
  public static $Sugar$Dec$Head_2_0 instance = new $Sugar$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_30, Strategy h_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDecHead_2_0");
    Fail274:
    { 
      IStrategoTerm o_150 = null;
      IStrategoTerm m_150 = null;
      IStrategoTerm n_150 = null;
      IStrategoTerm p_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSugarDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail274;
      m_150 = term.getSubterm(0);
      n_150 = term.getSubterm(1);
      IStrategoList annos229 = term.getAnnotations();
      o_150 = annos229;
      term = g_30.invoke(context, m_150);
      if(term == null)
        break Fail274;
      p_150 = term;
      term = h_30.invoke(context, n_150);
      if(term == null)
        break Fail274;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSugarDecHead_2, new IStrategoTerm[]{p_150, term}), checkListAnnos(termFactory, o_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}