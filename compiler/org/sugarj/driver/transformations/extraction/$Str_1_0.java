package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str_1_0 extends Strategy 
{ 
  public static $Str_1_0 instance = new $Str_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail961:
    { 
      IStrategoTerm w_456 = null;
      IStrategoTerm v_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail961;
      v_456 = term.getSubterm(0);
      IStrategoList annos203 = term.getAnnotations();
      w_456 = annos203;
      term = l_346.invoke(context, v_456);
      if(term == null)
        break Fail961;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}