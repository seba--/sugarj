package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Sugar$Dec_1_0 extends Strategy 
{ 
  public static $Super$Sugar$Dec_1_0 instance = new $Super$Sugar$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperSugarDec_1_0");
    Fail273:
    { 
      IStrategoTerm d_150 = null;
      IStrategoTerm c_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSuperSugarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail273;
      c_150 = term.getSubterm(0);
      IStrategoList annos227 = term.getAnnotations();
      d_150 = annos227;
      term = c_30.invoke(context, c_150);
      if(term == null)
        break Fail273;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSuperSugarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}