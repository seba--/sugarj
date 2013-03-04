package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Chars_1_0 extends Strategy 
{ 
  public static $Chars_1_0 instance = new $Chars_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Chars_1_0");
    Fail223:
    { 
      IStrategoTerm y_172 = null;
      IStrategoTerm x_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChars_1 != ((IStrategoAppl)term).getConstructor())
        break Fail223;
      x_172 = term.getSubterm(0);
      IStrategoList annos183 = term.getAnnotations();
      y_172 = annos183;
      term = b_40.invoke(context, x_172);
      if(term == null)
        break Fail223;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChars_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_172));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}