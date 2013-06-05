package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Transformation$Def_2_0 extends Strategy 
{ 
  public static $Transformation$Def_2_0 instance = new $Transformation$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_15, Strategy u_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransformationDef_2_0");
    Fail28:
    { 
      IStrategoTerm l_102 = null;
      IStrategoTerm j_102 = null;
      IStrategoTerm k_102 = null;
      IStrategoTerm m_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consTransformationDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      j_102 = term.getSubterm(0);
      k_102 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      l_102 = annos1;
      term = t_15.invoke(context, j_102);
      if(term == null)
        break Fail28;
      m_102 = term;
      term = u_15.invoke(context, k_102);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consTransformationDef_2, new IStrategoTerm[]{m_102, term}), checkListAnnos(termFactory, l_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}