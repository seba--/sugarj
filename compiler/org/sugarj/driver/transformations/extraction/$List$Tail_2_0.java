package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Tail_2_0 extends Strategy 
{ 
  public static $List$Tail_2_0 instance = new $List$Tail_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_24, Strategy o_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail149:
    { 
      IStrategoTerm c_127 = null;
      IStrategoTerm z_126 = null;
      IStrategoTerm b_127 = null;
      IStrategoTerm e_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      z_126 = term.getSubterm(0);
      b_127 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      c_127 = annos122;
      term = n_24.invoke(context, z_126);
      if(term == null)
        break Fail149;
      e_127 = term;
      term = o_24.invoke(context, b_127);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consListTail_2, new IStrategoTerm[]{e_127, term}), checkListAnnos(termFactory, c_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}