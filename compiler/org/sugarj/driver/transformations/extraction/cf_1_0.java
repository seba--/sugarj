package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class cf_1_0 extends Strategy 
{ 
  public static cf_1_0 instance = new cf_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("cf_1_0");
    Fail241:
    { 
      IStrategoTerm r_143 = null;
      IStrategoTerm q_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscf_1 != ((IStrategoAppl)term).getConstructor())
        break Fail241;
      q_143 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      r_143 = annos198;
      term = g_28.invoke(context, q_143);
      if(term == null)
        break Fail241;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscf_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}