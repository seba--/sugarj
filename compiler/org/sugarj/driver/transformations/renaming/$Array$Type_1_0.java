package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Type_1_0 extends Strategy 
{ 
  public static $Array$Type_1_0 instance = new $Array$Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayType_1_0");
    Fail154:
    { 
      IStrategoTerm h_128 = null;
      IStrategoTerm g_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      g_128 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      h_128 = annos133;
      term = h_25.invoke(context, g_128);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}