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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_15, Strategy v_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransformationDef_2_0");
    Fail28:
    { 
      IStrategoTerm n_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm o_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consTransformationDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      l_102 = term.getSubterm(0);
      m_102 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      n_102 = annos1;
      term = u_15.invoke(context, l_102);
      if(term == null)
        break Fail28;
      o_102 = term;
      term = v_15.invoke(context, m_102);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consTransformationDef_2, new IStrategoTerm[]{o_102, term}), checkListAnnos(termFactory, n_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}