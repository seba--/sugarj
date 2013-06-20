package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17, Strategy q_17, Strategy r_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail56:
    { 
      IStrategoTerm r_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm p_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm s_107 = null;
      IStrategoTerm t_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      o_107 = term.getSubterm(0);
      p_107 = term.getSubterm(1);
      q_107 = term.getSubterm(2);
      IStrategoList annos29 = term.getAnnotations();
      r_107 = annos29;
      term = p_17.invoke(context, o_107);
      if(term == null)
        break Fail56;
      s_107 = term;
      term = q_17.invoke(context, p_107);
      if(term == null)
        break Fail56;
      t_107 = term;
      term = r_17.invoke(context, q_107);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRule_3, new IStrategoTerm[]{s_107, t_107, term}), checkListAnnos(termFactory, r_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}