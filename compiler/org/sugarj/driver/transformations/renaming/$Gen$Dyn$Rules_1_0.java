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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail63:
    { 
      IStrategoTerm d_101 = null;
      IStrategoTerm c_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      c_101 = term.getSubterm(0);
      IStrategoList annos53 = term.getAnnotations();
      d_101 = annos53;
      term = x_13.invoke(context, c_101);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}