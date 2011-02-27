package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Compilation$Unit_3_0 extends Strategy 
{ 
  public static $Compilation$Unit_3_0 instance = new $Compilation$Unit_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_30, Strategy m_30, Strategy n_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail277:
    { 
      IStrategoTerm e_151 = null;
      IStrategoTerm z_150 = null;
      IStrategoTerm a_151 = null;
      IStrategoTerm d_151 = null;
      IStrategoTerm f_151 = null;
      IStrategoTerm g_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail277;
      z_150 = term.getSubterm(0);
      a_151 = term.getSubterm(1);
      d_151 = term.getSubterm(2);
      IStrategoList annos232 = term.getAnnotations();
      e_151 = annos232;
      term = l_30.invoke(context, z_150);
      if(term == null)
        break Fail277;
      f_151 = term;
      term = m_30.invoke(context, a_151);
      if(term == null)
        break Fail277;
      g_151 = term;
      term = n_30.invoke(context, d_151);
      if(term == null)
        break Fail277;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCompilationUnit_3, new IStrategoTerm[]{f_151, g_151, term}), checkListAnnos(termFactory, e_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}