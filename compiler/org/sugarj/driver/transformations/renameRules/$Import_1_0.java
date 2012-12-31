package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import_1_0 extends Strategy 
{ 
  public static $Import_1_0 instance = new $Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail37:
    { 
      IStrategoTerm c_96 = null;
      IStrategoTerm b_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      b_96 = term.getSubterm(0);
      IStrategoList annos31 = term.getAnnotations();
      c_96 = annos31;
      term = b_12.invoke(context, b_96);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}