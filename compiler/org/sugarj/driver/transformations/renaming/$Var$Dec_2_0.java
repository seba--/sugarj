package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_2_0 extends Strategy 
{ 
  public static $Var$Dec_2_0 instance = new $Var$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_12, Strategy m_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail51:
    { 
      IStrategoTerm m_97 = null;
      IStrategoTerm k_97 = null;
      IStrategoTerm l_97 = null;
      IStrategoTerm n_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      k_97 = term.getSubterm(0);
      l_97 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      m_97 = annos41;
      term = l_12.invoke(context, k_97);
      if(term == null)
        break Fail51;
      n_97 = term;
      term = m_12.invoke(context, l_97);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_2, new IStrategoTerm[]{n_97, term}), checkListAnnos(termFactory, m_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}