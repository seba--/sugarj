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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_26, Strategy v_26, Strategy w_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompilationUnit_3_0");
    Fail30:
    { 
      IStrategoTerm b_125 = null;
      IStrategoTerm w_124 = null;
      IStrategoTerm x_124 = null;
      IStrategoTerm a_125 = null;
      IStrategoTerm c_125 = null;
      IStrategoTerm d_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      w_124 = term.getSubterm(0);
      x_124 = term.getSubterm(1);
      a_125 = term.getSubterm(2);
      IStrategoList annos7 = term.getAnnotations();
      b_125 = annos7;
      term = u_26.invoke(context, w_124);
      if(term == null)
        break Fail30;
      c_125 = term;
      term = v_26.invoke(context, x_124);
      if(term == null)
        break Fail30;
      d_125 = term;
      term = w_26.invoke(context, a_125);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCompilationUnit_3, new IStrategoTerm[]{c_125, d_125, term}), checkListAnnos(termFactory, b_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}