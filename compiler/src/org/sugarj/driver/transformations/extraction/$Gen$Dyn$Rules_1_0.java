package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gen$Dyn$Rules_1_0 extends Strategy 
{ 
  public static $Gen$Dyn$Rules_1_0 instance = new $Gen$Dyn$Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail89:
    { 
      IStrategoTerm x_114 = null;
      IStrategoTerm w_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      w_114 = term.getSubterm(0);
      IStrategoList annos62 = term.getAnnotations();
      x_114 = annos62;
      term = h_20.invoke(context, w_114);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}