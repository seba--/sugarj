package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Package$Name_1_0 extends Strategy 
{ 
  public static $Package$Name_1_0 instance = new $Package$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageName_1_0");
    Fail223:
    { 
      IStrategoTerm s_150 = null;
      IStrategoTerm r_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail223;
      r_150 = term.getSubterm(0);
      IStrategoList annos197 = term.getAnnotations();
      s_150 = annos197;
      term = s_31.invoke(context, r_150);
      if(term == null)
        break Fail223;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}