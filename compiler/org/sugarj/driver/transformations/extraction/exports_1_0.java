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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("exports_1_0");
    Fail217:
    { 
      IStrategoTerm e_138 = null;
      IStrategoTerm d_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consexports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail217;
      d_138 = term.getSubterm(0);
      IStrategoList annos177 = term.getAnnotations();
      e_138 = annos177;
      term = a_27.invoke(context, d_138);
      if(term == null)
        break Fail217;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consexports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}