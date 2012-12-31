package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail36:
    { 
      IStrategoTerm z_95 = null;
      IStrategoTerm y_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      y_95 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      z_95 = annos30;
      term = a_12.invoke(context, y_95);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}