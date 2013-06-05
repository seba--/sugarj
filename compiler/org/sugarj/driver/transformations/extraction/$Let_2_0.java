package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_23, Strategy e_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail136:
    { 
      IStrategoTerm d_123 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm e_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      b_123 = term.getSubterm(0);
      c_123 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      d_123 = annos106;
      term = d_23.invoke(context, b_123);
      if(term == null)
        break Fail136;
      e_123 = term;
      term = e_23.invoke(context, c_123);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consLet_2, new IStrategoTerm[]{e_123, term}), checkListAnnos(termFactory, d_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}