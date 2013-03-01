package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Import$On$Demand$Dec_1_0 extends Strategy 
{ 
  public static $Type$Import$On$Demand$Dec_1_0 instance = new $Type$Import$On$Demand$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportOnDemandDec_1_0");
    Fail53:
    { 
      IStrategoTerm b_129 = null;
      IStrategoTerm a_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      a_129 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      b_129 = annos29;
      term = h_28.invoke(context, a_129);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}