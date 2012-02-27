package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Name_2_0 extends Strategy 
{ 
  public static $Expr$Name_2_0 instance = new $Expr$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_26, Strategy h_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_2_0");
    Fail171:
    { 
      IStrategoTerm c_132 = null;
      IStrategoTerm a_132 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm d_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      a_132 = term.getSubterm(0);
      b_132 = term.getSubterm(1);
      IStrategoList annos150 = term.getAnnotations();
      c_132 = annos150;
      term = g_26.invoke(context, a_132);
      if(term == null)
        break Fail171;
      d_132 = term;
      term = h_26.invoke(context, b_132);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_2, new IStrategoTerm[]{d_132, term}), checkListAnnos(termFactory, c_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}