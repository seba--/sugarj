package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Unbound$Wld_1_0 extends Strategy 
{ 
  public static $Unbound$Wld_1_0 instance = new $Unbound$Wld_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnboundWld_1_0");
    Fail69:
    { 
      IStrategoTerm r_133 = null;
      IStrategoTerm p_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consUnboundWld_1 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      p_133 = term.getSubterm(0);
      IStrategoList annos45 = term.getAnnotations();
      r_133 = annos45;
      term = j_29.invoke(context, p_133);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consUnboundWld_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}