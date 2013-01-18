package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throw_1_0 extends Strategy 
{ 
  public static $Throw_1_0 instance = new $Throw_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Throw_1_0");
    Fail116:
    { 
      IStrategoTerm u_149 = null;
      IStrategoTerm t_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consThrow_1 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      t_149 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      u_149 = annos89;
      term = q_33.invoke(context, t_149);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consThrow_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}