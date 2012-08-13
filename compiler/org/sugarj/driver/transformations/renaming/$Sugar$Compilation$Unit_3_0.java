package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Compilation$Unit_3_0 extends Strategy 
{ 
  public static $Sugar$Compilation$Unit_3_0 instance = new $Sugar$Compilation$Unit_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17, Strategy z_17, Strategy a_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarCompilationUnit_3_0");
    Fail25:
    { 
      IStrategoTerm w_105 = null;
      IStrategoTerm t_105 = null;
      IStrategoTerm u_105 = null;
      IStrategoTerm v_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSugarCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      t_105 = term.getSubterm(0);
      u_105 = term.getSubterm(1);
      v_105 = term.getSubterm(2);
      IStrategoList annos7 = term.getAnnotations();
      w_105 = annos7;
      term = y_17.invoke(context, t_105);
      if(term == null)
        break Fail25;
      x_105 = term;
      term = z_17.invoke(context, u_105);
      if(term == null)
        break Fail25;
      y_105 = term;
      term = a_18.invoke(context, v_105);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSugarCompilationUnit_3, new IStrategoTerm[]{x_105, y_105, term}), checkListAnnos(termFactory, w_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}