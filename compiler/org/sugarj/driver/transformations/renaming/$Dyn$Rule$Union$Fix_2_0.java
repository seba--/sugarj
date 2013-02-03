package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union$Fix_2_0 instance = new $Dyn$Rule$Union$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_13, Strategy x_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail60:
    { 
      IStrategoTerm x_100 = null;
      IStrategoTerm v_100 = null;
      IStrategoTerm w_100 = null;
      IStrategoTerm y_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      v_100 = term.getSubterm(0);
      w_100 = term.getSubterm(1);
      IStrategoList annos51 = term.getAnnotations();
      x_100 = annos51;
      term = w_13.invoke(context, v_100);
      if(term == null)
        break Fail60;
      y_100 = term;
      term = x_13.invoke(context, w_100);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnionFix_2, new IStrategoTerm[]{y_100, term}), checkListAnnos(termFactory, x_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}