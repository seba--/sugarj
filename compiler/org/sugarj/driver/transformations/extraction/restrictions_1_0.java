package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restrictions_1_0 extends Strategy 
{ 
  public static restrictions_1_0 instance = new restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restrictions_1_0");
    Fail747:
    { 
      IStrategoTerm a_426 = null;
      IStrategoTerm z_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consrestrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail747;
      z_425 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      a_426 = annos19;
      term = k_334.invoke(context, z_425);
      if(term == null)
        break Fail747;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consrestrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}