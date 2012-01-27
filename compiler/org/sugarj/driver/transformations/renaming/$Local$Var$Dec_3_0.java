package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec_3_0 extends Strategy 
{ 
  public static $Local$Var$Dec_3_0 instance = new $Local$Var$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_20, Strategy l_20, Strategy m_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDec_3_0");
    Fail91:
    { 
      IStrategoTerm c_116 = null;
      IStrategoTerm z_115 = null;
      IStrategoTerm a_116 = null;
      IStrategoTerm b_116 = null;
      IStrategoTerm d_116 = null;
      IStrategoTerm e_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      z_115 = term.getSubterm(0);
      a_116 = term.getSubterm(1);
      b_116 = term.getSubterm(2);
      IStrategoList annos78 = term.getAnnotations();
      c_116 = annos78;
      term = k_20.invoke(context, z_115);
      if(term == null)
        break Fail91;
      d_116 = term;
      term = l_20.invoke(context, a_116);
      if(term == null)
        break Fail91;
      e_116 = term;
      term = m_20.invoke(context, b_116);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDec_3, new IStrategoTerm[]{d_116, e_116, term}), checkListAnnos(termFactory, c_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}