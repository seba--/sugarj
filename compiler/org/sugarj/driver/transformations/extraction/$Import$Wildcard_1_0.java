package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail65:
    { 
      IStrategoTerm r_109 = null;
      IStrategoTerm o_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      o_109 = term.getSubterm(0);
      IStrategoList annos38 = term.getAnnotations();
      r_109 = annos38;
      term = k_18.invoke(context, o_109);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}