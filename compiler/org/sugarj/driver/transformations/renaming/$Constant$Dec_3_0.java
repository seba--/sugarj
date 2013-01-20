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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_31, Strategy b_31, Strategy c_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstantDec_3_0");
    Fail85:
    { 
      IStrategoTerm v_140 = null;
      IStrategoTerm m_140 = null;
      IStrategoTerm q_140 = null;
      IStrategoTerm u_140 = null;
      IStrategoTerm w_140 = null;
      IStrategoTerm x_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstantDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      m_140 = term.getSubterm(0);
      q_140 = term.getSubterm(1);
      u_140 = term.getSubterm(2);
      IStrategoList annos61 = term.getAnnotations();
      v_140 = annos61;
      term = a_31.invoke(context, m_140);
      if(term == null)
        break Fail85;
      w_140 = term;
      term = b_31.invoke(context, q_140);
      if(term == null)
        break Fail85;
      x_140 = term;
      term = c_31.invoke(context, u_140);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstantDec_3, new IStrategoTerm[]{w_140, x_140, term}), checkListAnnos(termFactory, v_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}