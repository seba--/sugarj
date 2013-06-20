package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_1_0 extends Strategy 
{ 
  public static real_1_0 instance = new real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_1_0");
    Fail277:
    { 
      IStrategoTerm j_149 = null;
      IStrategoTerm i_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consreal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail277;
      i_149 = term.getSubterm(0);
      IStrategoList annos228 = term.getAnnotations();
      j_149 = annos228;
      term = t_29.invoke(context, i_149);
      if(term == null)
        break Fail277;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consreal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}