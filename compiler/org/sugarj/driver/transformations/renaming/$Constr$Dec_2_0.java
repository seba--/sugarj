package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec_2_0 extends Strategy 
{ 
  public static $Constr$Dec_2_0 instance = new $Constr$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_23, Strategy v_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDec_2_0");
    Fail106:
    { 
      IStrategoTerm f_122 = null;
      IStrategoTerm d_122 = null;
      IStrategoTerm e_122 = null;
      IStrategoTerm h_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      d_122 = term.getSubterm(0);
      e_122 = term.getSubterm(1);
      IStrategoList annos87 = term.getAnnotations();
      f_122 = annos87;
      term = u_23.invoke(context, d_122);
      if(term == null)
        break Fail106;
      h_122 = term;
      term = v_23.invoke(context, e_122);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDec_2, new IStrategoTerm[]{h_122, term}), checkListAnnos(termFactory, f_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}