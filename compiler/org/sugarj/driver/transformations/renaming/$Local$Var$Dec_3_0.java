package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec_3_0 extends Strategy 
{ 
  public static $Local$Var$Dec_3_0 instance = new $Local$Var$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_21, Strategy i_21, Strategy j_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDec_3_0");
    Fail96:
    { 
      IStrategoTerm a_117 = null;
      IStrategoTerm x_116 = null;
      IStrategoTerm y_116 = null;
      IStrategoTerm z_116 = null;
      IStrategoTerm b_117 = null;
      IStrategoTerm c_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      x_116 = term.getSubterm(0);
      y_116 = term.getSubterm(1);
      z_116 = term.getSubterm(2);
      IStrategoList annos78 = term.getAnnotations();
      a_117 = annos78;
      term = h_21.invoke(context, x_116);
      if(term == null)
        break Fail96;
      b_117 = term;
      term = i_21.invoke(context, y_116);
      if(term == null)
        break Fail96;
      c_117 = term;
      term = j_21.invoke(context, z_116);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDec_3, new IStrategoTerm[]{b_117, c_117, term}), checkListAnnos(termFactory, a_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}