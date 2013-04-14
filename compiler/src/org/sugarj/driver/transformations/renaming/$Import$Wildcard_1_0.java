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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail39:
    { 
      IStrategoTerm e_96 = null;
      IStrategoTerm d_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      d_96 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      e_96 = annos30;
      term = f_12.invoke(context, d_96);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}