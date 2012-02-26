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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayType_1_0");
    Fail152:
    { 
      IStrategoTerm z_127 = null;
      IStrategoTerm y_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      y_127 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      z_127 = annos133;
      term = z_24.invoke(context, y_127);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}