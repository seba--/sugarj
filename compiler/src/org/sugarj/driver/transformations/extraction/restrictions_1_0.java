package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restrictions_1_0 extends Strategy 
{ 
  public static restrictions_1_0 instance = new restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restrictions_1_0");
    Fail259:
    { 
      IStrategoTerm q_146 = null;
      IStrategoTerm p_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consrestrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail259;
      p_146 = term.getSubterm(0);
      IStrategoList annos211 = term.getAnnotations();
      q_146 = annos211;
      term = z_28.invoke(context, p_146);
      if(term == null)
        break Fail259;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consrestrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}