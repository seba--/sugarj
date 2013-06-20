package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class variables_1_0 extends Strategy 
{ 
  public static variables_1_0 instance = new variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("variables_1_0");
    Fail267:
    { 
      IStrategoTerm c_148 = null;
      IStrategoTerm b_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consvariables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail267;
      b_148 = term.getSubterm(0);
      IStrategoList annos219 = term.getAnnotations();
      c_148 = annos219;
      term = h_29.invoke(context, b_148);
      if(term == null)
        break Fail267;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consvariables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}