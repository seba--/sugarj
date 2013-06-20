package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail165:
    { 
      IStrategoTerm w_127 = null;
      IStrategoTerm v_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      v_127 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      w_127 = annos134;
      term = s_24.invoke(context, v_127);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}