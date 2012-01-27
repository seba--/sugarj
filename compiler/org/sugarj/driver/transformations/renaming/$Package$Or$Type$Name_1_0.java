package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Package$Or$Type$Name_1_0 extends Strategy 
{ 
  public static $Package$Or$Type$Name_1_0 instance = new $Package$Or$Type$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_1_0");
    Fail163:
    { 
      IStrategoTerm w_129 = null;
      IStrategoTerm v_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      v_129 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      w_129 = annos147;
      term = f_25.invoke(context, v_129);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}