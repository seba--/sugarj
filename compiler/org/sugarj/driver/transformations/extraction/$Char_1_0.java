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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail164:
    { 
      IStrategoTerm r_127 = null;
      IStrategoTerm q_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      q_127 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      r_127 = annos133;
      term = q_24.invoke(context, q_127);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}