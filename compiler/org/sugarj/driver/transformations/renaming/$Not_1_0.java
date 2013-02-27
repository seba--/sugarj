package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail92:
    { 
      IStrategoTerm u_105 = null;
      IStrategoTerm t_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      t_105 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      u_105 = annos81;
      term = n_15.invoke(context, t_105);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}