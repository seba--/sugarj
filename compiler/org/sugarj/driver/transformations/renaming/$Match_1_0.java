package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail340:
    { 
      IStrategoTerm p_192 = null;
      IStrategoTerm o_192 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail340;
      o_192 = term.getSubterm(0);
      IStrategoList annos286 = term.getAnnotations();
      p_192 = annos286;
      term = z_46.invoke(context, o_192);
      if(term == null)
        break Fail340;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}