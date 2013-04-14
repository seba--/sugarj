package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamed_module_2_0 extends Strategy 
{ 
  public static renamed_module_2_0 instance = new renamed_module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_26, Strategy u_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamed_module_2_0");
    Fail200:
    { 
      IStrategoTerm d_137 = null;
      IStrategoTerm a_137 = null;
      IStrategoTerm b_137 = null;
      IStrategoTerm e_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consrenamed_module_2 != ((IStrategoAppl)term).getConstructor())
        break Fail200;
      a_137 = term.getSubterm(0);
      b_137 = term.getSubterm(1);
      IStrategoList annos163 = term.getAnnotations();
      d_137 = annos163;
      term = t_26.invoke(context, a_137);
      if(term == null)
        break Fail200;
      e_137 = term;
      term = u_26.invoke(context, b_137);
      if(term == null)
        break Fail200;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consrenamed_module_2, new IStrategoTerm[]{e_137, term}), checkListAnnos(termFactory, d_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}