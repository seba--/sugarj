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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageName_1_0");
    Fail172:
    { 
      IStrategoTerm b_132 = null;
      IStrategoTerm z_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      z_131 = term.getSubterm(0);
      IStrategoList annos156 = term.getAnnotations();
      b_132 = annos156;
      term = s_25.invoke(context, z_131);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}