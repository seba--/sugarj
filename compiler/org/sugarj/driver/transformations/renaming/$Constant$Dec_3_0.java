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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_22, Strategy t_22, Strategy u_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstantDec_3_0");
    Fail95:
    { 
      IStrategoTerm c_119 = null;
      IStrategoTerm z_118 = null;
      IStrategoTerm a_119 = null;
      IStrategoTerm b_119 = null;
      IStrategoTerm d_119 = null;
      IStrategoTerm e_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstantDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      z_118 = term.getSubterm(0);
      a_119 = term.getSubterm(1);
      b_119 = term.getSubterm(2);
      IStrategoList annos76 = term.getAnnotations();
      c_119 = annos76;
      term = s_22.invoke(context, z_118);
      if(term == null)
        break Fail95;
      d_119 = term;
      term = t_22.invoke(context, a_119);
      if(term == null)
        break Fail95;
      e_119 = term;
      term = u_22.invoke(context, b_119);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstantDec_3, new IStrategoTerm[]{d_119, e_119, term}), checkListAnnos(termFactory, c_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}