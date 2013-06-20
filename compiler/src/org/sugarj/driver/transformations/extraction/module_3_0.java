package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_3_0 extends Strategy 
{ 
  public static module_3_0 instance = new module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_27, Strategy e_27, Strategy f_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_3_0");
    Fail219:
    { 
      IStrategoTerm o_138 = null;
      IStrategoTerm l_138 = null;
      IStrategoTerm m_138 = null;
      IStrategoTerm n_138 = null;
      IStrategoTerm p_138 = null;
      IStrategoTerm q_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consmodule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail219;
      l_138 = term.getSubterm(0);
      m_138 = term.getSubterm(1);
      n_138 = term.getSubterm(2);
      IStrategoList annos179 = term.getAnnotations();
      o_138 = annos179;
      term = d_27.invoke(context, l_138);
      if(term == null)
        break Fail219;
      p_138 = term;
      term = e_27.invoke(context, m_138);
      if(term == null)
        break Fail219;
      q_138 = term;
      term = f_27.invoke(context, n_138);
      if(term == null)
        break Fail219;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consmodule_3, new IStrategoTerm[]{p_138, q_138, term}), checkListAnnos(termFactory, o_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}