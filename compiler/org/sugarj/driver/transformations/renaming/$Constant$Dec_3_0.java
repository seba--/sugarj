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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_17, Strategy i_17, Strategy j_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstantDec_3_0");
    Fail47:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm o_106 = null;
      IStrategoTerm p_106 = null;
      IStrategoTerm q_106 = null;
      IStrategoTerm s_106 = null;
      IStrategoTerm t_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstantDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      o_106 = term.getSubterm(0);
      p_106 = term.getSubterm(1);
      q_106 = term.getSubterm(2);
      IStrategoList annos35 = term.getAnnotations();
      r_106 = annos35;
      term = h_17.invoke(context, o_106);
      if(term == null)
        break Fail47;
      s_106 = term;
      term = i_17.invoke(context, p_106);
      if(term == null)
        break Fail47;
      t_106 = term;
      term = j_17.invoke(context, q_106);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstantDec_3, new IStrategoTerm[]{s_106, t_106, term}), checkListAnnos(termFactory, r_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}