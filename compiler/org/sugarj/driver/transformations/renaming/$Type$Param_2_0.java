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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_24, Strategy y_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParam_2_0");
    Fail157:
    { 
      IStrategoTerm u_128 = null;
      IStrategoTerm s_128 = null;
      IStrategoTerm t_128 = null;
      IStrategoTerm v_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      s_128 = term.getSubterm(0);
      t_128 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      u_128 = annos141;
      term = x_24.invoke(context, s_128);
      if(term == null)
        break Fail157;
      v_128 = term;
      term = y_24.invoke(context, t_128);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParam_2, new IStrategoTerm[]{v_128, term}), checkListAnnos(termFactory, u_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}