package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class opt_1_0 extends Strategy 
{ 
  public static opt_1_0 instance = new opt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("opt_1_0");
    Fail237:
    { 
      IStrategoTerm g_143 = null;
      IStrategoTerm f_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consopt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail237;
      f_143 = term.getSubterm(0);
      IStrategoList annos195 = term.getAnnotations();
      g_143 = annos195;
      term = d_28.invoke(context, f_143);
      if(term == null)
        break Fail237;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consopt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}