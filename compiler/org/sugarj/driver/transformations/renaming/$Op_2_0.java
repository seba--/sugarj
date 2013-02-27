package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op_2_0 extends Strategy 
{ 
  public static $Op_2_0 instance = new $Op_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail143:
    { 
      IStrategoTerm l_114 = null;
      IStrategoTerm j_114 = null;
      IStrategoTerm k_114 = null;
      IStrategoTerm m_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      j_114 = term.getSubterm(0);
      k_114 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      l_114 = annos129;
      term = o_18.invoke(context, j_114);
      if(term == null)
        break Fail143;
      m_114 = term;
      term = p_18.invoke(context, k_114);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOp_2, new IStrategoTerm[]{m_114, term}), checkListAnnos(termFactory, l_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}