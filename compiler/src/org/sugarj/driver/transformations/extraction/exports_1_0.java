package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class exports_1_0 extends Strategy 
{ 
  public static exports_1_0 instance = new exports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("exports_1_0");
    Fail218:
    { 
      IStrategoTerm j_138 = null;
      IStrategoTerm i_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consexports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      i_138 = term.getSubterm(0);
      IStrategoList annos178 = term.getAnnotations();
      j_138 = annos178;
      term = c_27.invoke(context, i_138);
      if(term == null)
        break Fail218;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consexports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}