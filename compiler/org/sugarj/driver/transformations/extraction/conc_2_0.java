package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_2_0 extends Strategy 
{ 
  public static conc_2_0 instance = new conc_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_26, Strategy b_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_2_0");
    Fail191:
    { 
      IStrategoTerm f_133 = null;
      IStrategoTerm z_132 = null;
      IStrategoTerm c_133 = null;
      IStrategoTerm j_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consconc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail191;
      z_132 = term.getSubterm(0);
      c_133 = term.getSubterm(1);
      IStrategoList annos159 = term.getAnnotations();
      f_133 = annos159;
      term = a_26.invoke(context, z_132);
      if(term == null)
        break Fail191;
      j_133 = term;
      term = b_26.invoke(context, c_133);
      if(term == null)
        break Fail191;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consconc_2, new IStrategoTerm[]{j_133, term}), checkListAnnos(termFactory, f_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}