package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not$Eq_2_0 extends Strategy 
{ 
  public static $Not$Eq_2_0 instance = new $Not$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_22, Strategy h_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotEq_2_0");
    Fail118:
    { 
      IStrategoTerm d_121 = null;
      IStrategoTerm b_121 = null;
      IStrategoTerm c_121 = null;
      IStrategoTerm e_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      b_121 = term.getSubterm(0);
      c_121 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      d_121 = annos103;
      term = g_22.invoke(context, b_121);
      if(term == null)
        break Fail118;
      e_121 = term;
      term = h_22.invoke(context, c_121);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNotEq_2, new IStrategoTerm[]{e_121, term}), checkListAnnos(termFactory, d_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}