package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_3_0 extends Strategy 
{ 
  public static $Try_3_0 instance = new $Try_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_19, Strategy c_19, Strategy d_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_3_0");
    Fail72:
    { 
      IStrategoTerm k_112 = null;
      IStrategoTerm h_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm j_112 = null;
      IStrategoTerm l_112 = null;
      IStrategoTerm m_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_3 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      h_112 = term.getSubterm(0);
      i_112 = term.getSubterm(1);
      j_112 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      k_112 = annos60;
      term = b_19.invoke(context, h_112);
      if(term == null)
        break Fail72;
      l_112 = term;
      term = c_19.invoke(context, i_112);
      if(term == null)
        break Fail72;
      m_112 = term;
      term = d_19.invoke(context, j_112);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_3, new IStrategoTerm[]{l_112, m_112, term}), checkListAnnos(termFactory, k_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}