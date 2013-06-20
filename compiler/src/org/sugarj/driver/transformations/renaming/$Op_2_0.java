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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18, Strategy s_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail142:
    { 
      IStrategoTerm o_114 = null;
      IStrategoTerm m_114 = null;
      IStrategoTerm n_114 = null;
      IStrategoTerm p_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      m_114 = term.getSubterm(0);
      n_114 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      o_114 = annos129;
      term = r_18.invoke(context, m_114);
      if(term == null)
        break Fail142;
      p_114 = term;
      term = s_18.invoke(context, n_114);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOp_2, new IStrategoTerm[]{p_114, term}), checkListAnnos(termFactory, o_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}