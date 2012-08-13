package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec_2_0 extends Strategy 
{ 
  public static $Method$Dec_2_0 instance = new $Method$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_24, Strategy t_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDec_2_0");
    Fail116:
    { 
      IStrategoTerm u_124 = null;
      IStrategoTerm s_124 = null;
      IStrategoTerm t_124 = null;
      IStrategoTerm v_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      s_124 = term.getSubterm(0);
      t_124 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      u_124 = annos95;
      term = s_24.invoke(context, s_124);
      if(term == null)
        break Fail116;
      v_124 = term;
      term = t_24.invoke(context, t_124);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDec_2, new IStrategoTerm[]{v_124, term}), checkListAnnos(termFactory, u_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}