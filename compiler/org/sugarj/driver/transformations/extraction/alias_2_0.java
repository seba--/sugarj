package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alias_2_0 extends Strategy 
{ 
  public static alias_2_0 instance = new alias_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_25, Strategy f_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alias_2_0");
    Fail162:
    { 
      IStrategoTerm b_129 = null;
      IStrategoTerm z_128 = null;
      IStrategoTerm a_129 = null;
      IStrategoTerm c_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consalias_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      z_128 = term.getSubterm(0);
      a_129 = term.getSubterm(1);
      IStrategoList annos135 = term.getAnnotations();
      b_129 = annos135;
      term = e_25.invoke(context, z_128);
      if(term == null)
        break Fail162;
      c_129 = term;
      term = f_25.invoke(context, a_129);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consalias_2, new IStrategoTerm[]{c_129, term}), checkListAnnos(termFactory, b_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}