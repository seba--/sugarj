package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Arity$Param_3_0 extends Strategy 
{ 
  public static $Var$Arity$Param_3_0 instance = new $Var$Arity$Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17, Strategy a_18, Strategy b_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarArityParam_3_0");
    Fail60:
    { 
      IStrategoTerm l_109 = null;
      IStrategoTerm h_109 = null;
      IStrategoTerm i_109 = null;
      IStrategoTerm j_109 = null;
      IStrategoTerm m_109 = null;
      IStrategoTerm n_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      h_109 = term.getSubterm(0);
      i_109 = term.getSubterm(1);
      j_109 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      l_109 = annos50;
      term = z_17.invoke(context, h_109);
      if(term == null)
        break Fail60;
      m_109 = term;
      term = a_18.invoke(context, i_109);
      if(term == null)
        break Fail60;
      n_109 = term;
      term = b_18.invoke(context, j_109);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarArityParam_3, new IStrategoTerm[]{m_109, n_109, term}), checkListAnnos(termFactory, l_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}