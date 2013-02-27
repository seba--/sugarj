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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail127:
    { 
      IStrategoTerm c_112 = null;
      IStrategoTerm b_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      b_112 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      c_112 = annos114;
      term = t_17.invoke(context, b_112);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}