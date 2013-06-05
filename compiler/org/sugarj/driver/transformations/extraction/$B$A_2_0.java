package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_22, Strategy e_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail120:
    { 
      IStrategoTerm z_119 = null;
      IStrategoTerm x_119 = null;
      IStrategoTerm y_119 = null;
      IStrategoTerm c_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      x_119 = term.getSubterm(0);
      y_119 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      z_119 = annos92;
      term = d_22.invoke(context, x_119);
      if(term == null)
        break Fail120;
      c_120 = term;
      term = e_22.invoke(context, y_119);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consBA_2, new IStrategoTerm[]{c_120, term}), checkListAnnos(termFactory, z_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}