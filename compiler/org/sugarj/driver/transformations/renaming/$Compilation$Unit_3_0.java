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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_19, Strategy u_19, Strategy v_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail59:
    { 
      IStrategoTerm k_111 = null;
      IStrategoTerm h_111 = null;
      IStrategoTerm i_111 = null;
      IStrategoTerm j_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      h_111 = term.getSubterm(0);
      i_111 = term.getSubterm(1);
      j_111 = term.getSubterm(2);
      IStrategoList annos41 = term.getAnnotations();
      k_111 = annos41;
      term = t_19.invoke(context, h_111);
      if(term == null)
        break Fail59;
      l_111 = term;
      term = u_19.invoke(context, i_111);
      if(term == null)
        break Fail59;
      m_111 = term;
      term = v_19.invoke(context, j_111);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCompilationUnit_3, new IStrategoTerm[]{l_111, m_111, term}), checkListAnnos(termFactory, k_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}