package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Deci_1_0 extends Strategy 
{ 
  public static $Deci_1_0 instance = new $Deci_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Deci_1_0");
    Fail243:
    { 
      IStrategoTerm b_152 = null;
      IStrategoTerm a_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeci_1 != ((IStrategoAppl)term).getConstructor())
        break Fail243;
      a_152 = term.getSubterm(0);
      IStrategoList annos206 = term.getAnnotations();
      b_152 = annos206;
      term = b_32.invoke(context, a_152);
      if(term == null)
        break Fail243;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeci_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}