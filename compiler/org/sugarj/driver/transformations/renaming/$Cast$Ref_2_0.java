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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_29, Strategy l_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastRef_2_0");
    Fail184:
    { 
      IStrategoTerm a_143 = null;
      IStrategoTerm y_142 = null;
      IStrategoTerm z_142 = null;
      IStrategoTerm b_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      y_142 = term.getSubterm(0);
      z_142 = term.getSubterm(1);
      IStrategoList annos159 = term.getAnnotations();
      a_143 = annos159;
      term = k_29.invoke(context, y_142);
      if(term == null)
        break Fail184;
      b_143 = term;
      term = l_29.invoke(context, z_142);
      if(term == null)
        break Fail184;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastRef_2, new IStrategoTerm[]{b_143, term}), checkListAnnos(termFactory, a_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}