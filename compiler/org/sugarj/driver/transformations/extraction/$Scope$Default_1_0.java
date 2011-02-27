package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Default_1_0 extends Strategy 
{ 
  public static $Scope$Default_1_0 instance = new $Scope$Default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail109:
    { 
      IStrategoTerm c_120 = null;
      IStrategoTerm z_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      z_119 = term.getSubterm(0);
      IStrategoList annos85 = term.getAnnotations();
      c_120 = annos85;
      term = g_22.invoke(context, z_119);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}