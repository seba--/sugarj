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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_39, Strategy g_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParam_2_0");
    Fail198:
    { 
      IStrategoTerm y_169 = null;
      IStrategoTerm w_169 = null;
      IStrategoTerm x_169 = null;
      IStrategoTerm z_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail198;
      w_169 = term.getSubterm(0);
      x_169 = term.getSubterm(1);
      IStrategoList annos167 = term.getAnnotations();
      y_169 = annos167;
      term = f_39.invoke(context, w_169);
      if(term == null)
        break Fail198;
      z_169 = term;
      term = g_39.invoke(context, x_169);
      if(term == null)
        break Fail198;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeParam_2, new IStrategoTerm[]{z_169, term}), checkListAnnos(termFactory, y_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}