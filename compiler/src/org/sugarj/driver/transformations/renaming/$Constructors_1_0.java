package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructors_1_0 extends Strategy 
{ 
  public static $Constructors_1_0 instance = new $Constructors_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail126:
    { 
      IStrategoTerm g_112 = null;
      IStrategoTerm f_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      f_112 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      g_112 = annos114;
      term = w_17.invoke(context, f_112);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}