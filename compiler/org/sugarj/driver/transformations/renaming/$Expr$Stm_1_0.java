package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Stm_1_0 extends Strategy 
{ 
  public static $Expr$Stm_1_0 instance = new $Expr$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprStm_1_0");
    Fail129:
    { 
      IStrategoTerm n_153 = null;
      IStrategoTerm m_153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      m_153 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      n_153 = annos102;
      term = p_34.invoke(context, m_153);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExprStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}