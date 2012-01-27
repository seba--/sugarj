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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayType_1_0");
    Fail149:
    { 
      IStrategoTerm j_127 = null;
      IStrategoTerm i_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      i_127 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      j_127 = annos133;
      term = k_24.invoke(context, i_127);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}