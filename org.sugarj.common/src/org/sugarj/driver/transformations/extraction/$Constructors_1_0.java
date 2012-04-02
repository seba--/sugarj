package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail141:
    { 
      IStrategoTerm w_125 = null;
      IStrategoTerm v_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      v_125 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      w_125 = annos114;
      term = c_24.invoke(context, v_125);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}