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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_20, Strategy u_20, Strategy v_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FieldDec_3_0");
    Fail97:
    { 
      IStrategoTerm z_116 = null;
      IStrategoTerm w_116 = null;
      IStrategoTerm x_116 = null;
      IStrategoTerm y_116 = null;
      IStrategoTerm a_117 = null;
      IStrategoTerm b_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      w_116 = term.getSubterm(0);
      x_116 = term.getSubterm(1);
      y_116 = term.getSubterm(2);
      IStrategoList annos83 = term.getAnnotations();
      z_116 = annos83;
      term = t_20.invoke(context, w_116);
      if(term == null)
        break Fail97;
      a_117 = term;
      term = u_20.invoke(context, x_116);
      if(term == null)
        break Fail97;
      b_117 = term;
      term = v_20.invoke(context, y_116);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFieldDec_3, new IStrategoTerm[]{a_117, b_117, term}), checkListAnnos(termFactory, z_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}