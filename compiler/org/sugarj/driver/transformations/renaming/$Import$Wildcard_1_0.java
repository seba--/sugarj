package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Wildcard_1_0 extends Strategy 
{ 
  public static $Import$Wildcard_1_0 instance = new $Import$Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail277:
    { 
      IStrategoTerm r_180 = null;
      IStrategoTerm q_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail277;
      q_180 = term.getSubterm(0);
      IStrategoList annos224 = term.getAnnotations();
      r_180 = annos224;
      term = s_42.invoke(context, q_180);
      if(term == null)
        break Fail277;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}