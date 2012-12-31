package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_12, Strategy n_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail47:
    { 
      IStrategoTerm n_97 = null;
      IStrategoTerm l_97 = null;
      IStrategoTerm m_97 = null;
      IStrategoTerm o_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      l_97 = term.getSubterm(0);
      m_97 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      n_97 = annos41;
      term = m_12.invoke(context, l_97);
      if(term == null)
        break Fail47;
      o_97 = term;
      term = n_12.invoke(context, m_97);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_2, new IStrategoTerm[]{o_97, term}), checkListAnnos(termFactory, n_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}