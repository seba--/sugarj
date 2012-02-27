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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21, Strategy r_21, Strategy s_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FieldDec_3_0");
    Fail102:
    { 
      IStrategoTerm x_117 = null;
      IStrategoTerm u_117 = null;
      IStrategoTerm v_117 = null;
      IStrategoTerm w_117 = null;
      IStrategoTerm y_117 = null;
      IStrategoTerm z_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      u_117 = term.getSubterm(0);
      v_117 = term.getSubterm(1);
      w_117 = term.getSubterm(2);
      IStrategoList annos83 = term.getAnnotations();
      x_117 = annos83;
      term = q_21.invoke(context, u_117);
      if(term == null)
        break Fail102;
      y_117 = term;
      term = r_21.invoke(context, v_117);
      if(term == null)
        break Fail102;
      z_117 = term;
      term = s_21.invoke(context, w_117);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFieldDec_3, new IStrategoTerm[]{y_117, z_117, term}), checkListAnnos(termFactory, x_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}