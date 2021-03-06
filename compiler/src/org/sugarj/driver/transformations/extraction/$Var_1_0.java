package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail173:
    { 
      IStrategoTerm c_129 = null;
      IStrategoTerm b_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      b_129 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      c_129 = annos142;
      term = d_25.invoke(context, b_129);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}