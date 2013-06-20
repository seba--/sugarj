package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Tail_2_0 extends Strategy 
{ 
  public static $List$Tail_2_0 instance = new $List$Tail_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_24, Strategy p_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail162:
    { 
      IStrategoTerm m_127 = null;
      IStrategoTerm k_127 = null;
      IStrategoTerm l_127 = null;
      IStrategoTerm n_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      k_127 = term.getSubterm(0);
      l_127 = term.getSubterm(1);
      IStrategoList annos131 = term.getAnnotations();
      m_127 = annos131;
      term = o_24.invoke(context, k_127);
      if(term == null)
        break Fail162;
      n_127 = term;
      term = p_24.invoke(context, l_127);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consListTail_2, new IStrategoTerm[]{n_127, term}), checkListAnnos(termFactory, m_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}