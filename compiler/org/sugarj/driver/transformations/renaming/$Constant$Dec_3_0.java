package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constant$Dec_3_0 extends Strategy 
{ 
  public static $Constant$Dec_3_0 instance = new $Constant$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_16, Strategy t_16, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstantDec_3_0");
    Fail44:
    { 
      IStrategoTerm b_106 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      IStrategoTerm z_105 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstantDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      x_105 = term.getSubterm(0);
      y_105 = term.getSubterm(1);
      z_105 = term.getSubterm(2);
      IStrategoList annos35 = term.getAnnotations();
      b_106 = annos35;
      term = s_16.invoke(context, x_105);
      if(term == null)
        break Fail44;
      c_106 = term;
      term = t_16.invoke(context, y_105);
      if(term == null)
        break Fail44;
      d_106 = term;
      term = u_16.invoke(context, z_105);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstantDec_3, new IStrategoTerm[]{c_106, d_106, term}), checkListAnnos(termFactory, b_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}