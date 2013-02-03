package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gen$Dyn$Rules_1_0 extends Strategy 
{ 
  public static $Gen$Dyn$Rules_1_0 instance = new $Gen$Dyn$Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail62:
    { 
      IStrategoTerm g_101 = null;
      IStrategoTerm f_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      f_101 = term.getSubterm(0);
      IStrategoList annos53 = term.getAnnotations();
      g_101 = annos53;
      term = a_14.invoke(context, f_101);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}