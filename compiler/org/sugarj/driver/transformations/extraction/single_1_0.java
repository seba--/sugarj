package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class single_1_0 extends Strategy 
{ 
  public static single_1_0 instance = new single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("single_1_0");
    Fail989:
    { 
      IStrategoTerm s_461 = null;
      IStrategoTerm r_461 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail989;
      r_461 = term.getSubterm(0);
      IStrategoList annos229 = term.getAnnotations();
      s_461 = annos229;
      term = j_348.invoke(context, r_461);
      if(term == null)
        break Fail989;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_461));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}