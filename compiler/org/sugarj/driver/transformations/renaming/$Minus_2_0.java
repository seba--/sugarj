package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_2_0 extends Strategy 
{ 
  public static $Minus_2_0 instance = new $Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_22, Strategy z_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_2_0");
    Fail127:
    { 
      IStrategoTerm d_123 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm e_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      b_123 = term.getSubterm(0);
      c_123 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      d_123 = annos112;
      term = y_22.invoke(context, b_123);
      if(term == null)
        break Fail127;
      e_123 = term;
      term = z_22.invoke(context, c_123);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_2, new IStrategoTerm[]{e_123, term}), checkListAnnos(termFactory, d_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}