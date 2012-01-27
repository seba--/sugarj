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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21, Strategy d_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignAnd_2_0");
    Fail103:
    { 
      IStrategoTerm v_117 = null;
      IStrategoTerm t_117 = null;
      IStrategoTerm u_117 = null;
      IStrategoTerm w_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      t_117 = term.getSubterm(0);
      u_117 = term.getSubterm(1);
      IStrategoList annos88 = term.getAnnotations();
      v_117 = annos88;
      term = c_21.invoke(context, t_117);
      if(term == null)
        break Fail103;
      w_117 = term;
      term = d_21.invoke(context, u_117);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignAnd_2, new IStrategoTerm[]{w_117, term}), checkListAnnos(termFactory, v_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}