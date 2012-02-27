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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_1_0");
    Fail168:
    { 
      IStrategoTerm h_131 = null;
      IStrategoTerm g_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      g_131 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      h_131 = annos147;
      term = c_26.invoke(context, g_131);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}