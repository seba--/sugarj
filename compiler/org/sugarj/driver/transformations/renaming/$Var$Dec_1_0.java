package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_1_0 extends Strategy 
{ 
  public static $Var$Dec_1_0 instance = new $Var$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_1_0");
    Fail137:
    { 
      IStrategoTerm n_155 = null;
      IStrategoTerm m_155 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      m_155 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      n_155 = annos108;
      term = a_35.invoke(context, m_155);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_155));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}