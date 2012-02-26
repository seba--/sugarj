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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_1_0");
    Fail166:
    { 
      IStrategoTerm v_130 = null;
      IStrategoTerm u_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      u_130 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      v_130 = annos147;
      term = u_25.invoke(context, u_130);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}