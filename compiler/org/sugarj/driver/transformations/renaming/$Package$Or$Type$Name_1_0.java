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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_1_0");
    Fail204:
    { 
      IStrategoTerm w_170 = null;
      IStrategoTerm v_170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPackageOrTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      v_170 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      w_170 = annos173;
      term = n_39.invoke(context, v_170);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPackageOrTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_170));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}