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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_13, Strategy u_13, Strategy v_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail8:
    { 
      IStrategoTerm i_98 = null;
      IStrategoTerm f_98 = null;
      IStrategoTerm g_98 = null;
      IStrategoTerm h_98 = null;
      IStrategoTerm j_98 = null;
      IStrategoTerm l_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail8;
      f_98 = term.getSubterm(0);
      g_98 = term.getSubterm(1);
      h_98 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      i_98 = annos0;
      term = t_13.invoke(context, f_98);
      if(term == null)
        break Fail8;
      j_98 = term;
      term = u_13.invoke(context, g_98);
      if(term == null)
        break Fail8;
      l_98 = term;
      term = v_13.invoke(context, h_98);
      if(term == null)
        break Fail8;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCompilationUnit_3, new IStrategoTerm[]{j_98, l_98, term}), checkListAnnos(termFactory, i_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}