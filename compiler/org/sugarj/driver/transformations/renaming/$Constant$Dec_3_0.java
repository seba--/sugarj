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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17, Strategy q_17, Strategy r_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstantDec_3_0");
    Fail49:
    { 
      IStrategoTerm a_107 = null;
      IStrategoTerm x_106 = null;
      IStrategoTerm y_106 = null;
      IStrategoTerm z_106 = null;
      IStrategoTerm b_107 = null;
      IStrategoTerm c_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstantDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      x_106 = term.getSubterm(0);
      y_106 = term.getSubterm(1);
      z_106 = term.getSubterm(2);
      IStrategoList annos35 = term.getAnnotations();
      a_107 = annos35;
      term = p_17.invoke(context, x_106);
      if(term == null)
        break Fail49;
      b_107 = term;
      term = q_17.invoke(context, y_106);
      if(term == null)
        break Fail49;
      c_107 = term;
      term = r_17.invoke(context, z_106);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstantDec_3, new IStrategoTerm[]{b_107, c_107, term}), checkListAnnos(termFactory, a_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}