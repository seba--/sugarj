package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Field$Dec_3_0 extends Strategy 
{ 
  public static $Field$Dec_3_0 instance = new $Field$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_26, Strategy u_26, Strategy v_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FieldDec_3_0");
    Fail148:
    { 
      IStrategoTerm y_130 = null;
      IStrategoTerm v_130 = null;
      IStrategoTerm w_130 = null;
      IStrategoTerm x_130 = null;
      IStrategoTerm z_130 = null;
      IStrategoTerm a_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      v_130 = term.getSubterm(0);
      w_130 = term.getSubterm(1);
      x_130 = term.getSubterm(2);
      IStrategoList annos124 = term.getAnnotations();
      y_130 = annos124;
      term = t_26.invoke(context, v_130);
      if(term == null)
        break Fail148;
      z_130 = term;
      term = u_26.invoke(context, w_130);
      if(term == null)
        break Fail148;
      a_131 = term;
      term = v_26.invoke(context, x_130);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFieldDec_3, new IStrategoTerm[]{z_130, a_131, term}), checkListAnnos(termFactory, y_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}