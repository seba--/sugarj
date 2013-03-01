package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_41, Strategy w_41, Strategy x_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail267:
    { 
      IStrategoTerm k_178 = null;
      IStrategoTerm h_178 = null;
      IStrategoTerm i_178 = null;
      IStrategoTerm j_178 = null;
      IStrategoTerm l_178 = null;
      IStrategoTerm m_178 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail267;
      h_178 = term.getSubterm(0);
      i_178 = term.getSubterm(1);
      j_178 = term.getSubterm(2);
      IStrategoList annos214 = term.getAnnotations();
      k_178 = annos214;
      term = v_41.invoke(context, h_178);
      if(term == null)
        break Fail267;
      l_178 = term;
      term = w_41.invoke(context, i_178);
      if(term == null)
        break Fail267;
      m_178 = term;
      term = x_41.invoke(context, j_178);
      if(term == null)
        break Fail267;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRule_3, new IStrategoTerm[]{l_178, m_178, term}), checkListAnnos(termFactory, k_178));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}