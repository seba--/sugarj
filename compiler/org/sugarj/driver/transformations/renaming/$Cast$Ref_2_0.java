package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Ref_2_0 extends Strategy 
{ 
  public static $Cast$Ref_2_0 instance = new $Cast$Ref_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_23, Strategy l_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastRef_2_0");
    Fail133:
    { 
      IStrategoTerm o_124 = null;
      IStrategoTerm j_124 = null;
      IStrategoTerm n_124 = null;
      IStrategoTerm p_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      j_124 = term.getSubterm(0);
      n_124 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      o_124 = annos118;
      term = k_23.invoke(context, j_124);
      if(term == null)
        break Fail133;
      p_124 = term;
      term = l_23.invoke(context, n_124);
      if(term == null)
        break Fail133;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastRef_2, new IStrategoTerm[]{p_124, term}), checkListAnnos(termFactory, o_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}