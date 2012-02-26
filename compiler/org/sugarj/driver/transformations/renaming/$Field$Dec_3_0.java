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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_21, Strategy j_21, Strategy k_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FieldDec_3_0");
    Fail100:
    { 
      IStrategoTerm p_117 = null;
      IStrategoTerm m_117 = null;
      IStrategoTerm n_117 = null;
      IStrategoTerm o_117 = null;
      IStrategoTerm q_117 = null;
      IStrategoTerm r_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      m_117 = term.getSubterm(0);
      n_117 = term.getSubterm(1);
      o_117 = term.getSubterm(2);
      IStrategoList annos83 = term.getAnnotations();
      p_117 = annos83;
      term = i_21.invoke(context, m_117);
      if(term == null)
        break Fail100;
      q_117 = term;
      term = j_21.invoke(context, n_117);
      if(term == null)
        break Fail100;
      r_117 = term;
      term = k_21.invoke(context, o_117);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFieldDec_3, new IStrategoTerm[]{q_117, r_117, term}), checkListAnnos(termFactory, p_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}