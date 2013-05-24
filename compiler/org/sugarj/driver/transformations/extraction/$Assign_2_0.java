package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_344, Strategy s_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail925:
    { 
      IStrategoTerm c_452 = null;
      IStrategoTerm a_452 = null;
      IStrategoTerm b_452 = null;
      IStrategoTerm d_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail925;
      a_452 = term.getSubterm(0);
      b_452 = term.getSubterm(1);
      IStrategoList annos170 = term.getAnnotations();
      c_452 = annos170;
      term = r_344.invoke(context, a_452);
      if(term == null)
        break Fail925;
      d_452 = term;
      term = s_344.invoke(context, b_452);
      if(term == null)
        break Fail925;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAssign_2, new IStrategoTerm[]{d_452, term}), checkListAnnos(termFactory, c_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}