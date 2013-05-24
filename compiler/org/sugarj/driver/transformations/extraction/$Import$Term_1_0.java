package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Term_1_0 extends Strategy 
{ 
  public static $Import$Term_1_0 instance = new $Import$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail982:
    { 
      IStrategoTerm r_460 = null;
      IStrategoTerm q_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail982;
      q_460 = term.getSubterm(0);
      IStrategoList annos222 = term.getAnnotations();
      r_460 = annos222;
      term = z_347.invoke(context, q_460);
      if(term == null)
        break Fail982;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}