package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Args_1_0 extends Strategy 
{ 
  public static $Type$Args_1_0 instance = new $Type$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeArgs_1_0");
    Fail212:
    { 
      IStrategoTerm b_149 = null;
      IStrategoTerm a_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      a_149 = term.getSubterm(0);
      IStrategoList annos186 = term.getAnnotations();
      b_149 = annos186;
      term = c_31.invoke(context, a_149);
      if(term == null)
        break Fail212;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}