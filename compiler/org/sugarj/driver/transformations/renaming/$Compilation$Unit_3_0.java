package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_14, Strategy r_14, Strategy s_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail13:
    { 
      IStrategoTerm l_99 = null;
      IStrategoTerm i_99 = null;
      IStrategoTerm j_99 = null;
      IStrategoTerm k_99 = null;
      IStrategoTerm m_99 = null;
      IStrategoTerm n_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      i_99 = term.getSubterm(0);
      j_99 = term.getSubterm(1);
      k_99 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      l_99 = annos0;
      term = q_14.invoke(context, i_99);
      if(term == null)
        break Fail13;
      m_99 = term;
      term = r_14.invoke(context, j_99);
      if(term == null)
        break Fail13;
      n_99 = term;
      term = s_14.invoke(context, k_99);
      if(term == null)
        break Fail13;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCompilationUnit_3, new IStrategoTerm[]{m_99, n_99, term}), checkListAnnos(termFactory, l_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}