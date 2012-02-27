package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Param_2_0 extends Strategy 
{ 
  public static $Type$Param_2_0 instance = new $Type$Param_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_25, Strategy v_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParam_2_0");
    Fail162:
    { 
      IStrategoTerm b_130 = null;
      IStrategoTerm y_129 = null;
      IStrategoTerm a_130 = null;
      IStrategoTerm d_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      y_129 = term.getSubterm(0);
      a_130 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      b_130 = annos141;
      term = u_25.invoke(context, y_129);
      if(term == null)
        break Fail162;
      d_130 = term;
      term = v_25.invoke(context, a_130);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParam_2, new IStrategoTerm[]{d_130, term}), checkListAnnos(termFactory, b_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}