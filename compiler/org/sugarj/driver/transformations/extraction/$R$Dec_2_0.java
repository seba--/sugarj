package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_16, Strategy j_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail37:
    { 
      IStrategoTerm z_103 = null;
      IStrategoTerm w_103 = null;
      IStrategoTerm x_103 = null;
      IStrategoTerm b_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      w_103 = term.getSubterm(0);
      x_103 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      z_103 = annos10;
      term = i_16.invoke(context, w_103);
      if(term == null)
        break Fail37;
      b_104 = term;
      term = j_16.invoke(context, x_103);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDec_2, new IStrategoTerm[]{b_104, term}), checkListAnnos(termFactory, z_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}