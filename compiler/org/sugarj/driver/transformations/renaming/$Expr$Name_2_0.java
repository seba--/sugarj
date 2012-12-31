package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Name_2_0 extends Strategy 
{ 
  public static $Expr$Name_2_0 instance = new $Expr$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_39, Strategy s_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_2_0");
    Fail207:
    { 
      IStrategoTerm o_171 = null;
      IStrategoTerm m_171 = null;
      IStrategoTerm n_171 = null;
      IStrategoTerm p_171 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExprName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail207;
      m_171 = term.getSubterm(0);
      n_171 = term.getSubterm(1);
      IStrategoList annos176 = term.getAnnotations();
      o_171 = annos176;
      term = r_39.invoke(context, m_171);
      if(term == null)
        break Fail207;
      p_171 = term;
      term = s_39.invoke(context, n_171);
      if(term == null)
        break Fail207;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExprName_2, new IStrategoTerm[]{p_171, term}), checkListAnnos(termFactory, o_171));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}