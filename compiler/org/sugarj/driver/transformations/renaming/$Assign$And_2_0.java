package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$And_2_0 extends Strategy 
{ 
  public static $Assign$And_2_0 instance = new $Assign$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_35, Strategy l_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignAnd_2_0");
    Fail144:
    { 
      IStrategoTerm y_156 = null;
      IStrategoTerm u_156 = null;
      IStrategoTerm x_156 = null;
      IStrategoTerm z_156 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      u_156 = term.getSubterm(0);
      x_156 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      y_156 = annos114;
      term = k_35.invoke(context, u_156);
      if(term == null)
        break Fail144;
      z_156 = term;
      term = l_35.invoke(context, x_156);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignAnd_2, new IStrategoTerm[]{z_156, term}), checkListAnnos(termFactory, y_156));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}