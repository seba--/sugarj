package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail106:
    { 
      IStrategoTerm g_119 = null;
      IStrategoTerm f_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      f_119 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      g_119 = annos81;
      term = z_21.invoke(context, f_119);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}