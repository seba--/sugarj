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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_14, Strategy j_14, Strategy k_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail11:
    { 
      IStrategoTerm d_99 = null;
      IStrategoTerm a_99 = null;
      IStrategoTerm b_99 = null;
      IStrategoTerm c_99 = null;
      IStrategoTerm e_99 = null;
      IStrategoTerm f_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      a_99 = term.getSubterm(0);
      b_99 = term.getSubterm(1);
      c_99 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      d_99 = annos0;
      term = i_14.invoke(context, a_99);
      if(term == null)
        break Fail11;
      e_99 = term;
      term = j_14.invoke(context, b_99);
      if(term == null)
        break Fail11;
      f_99 = term;
      term = k_14.invoke(context, c_99);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCompilationUnit_3, new IStrategoTerm[]{e_99, f_99, term}), checkListAnnos(termFactory, d_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}