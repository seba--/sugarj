package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class id_1_0 extends Strategy 
{ 
  public static id_1_0 instance = new id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("id_1_0");
    Fail252:
    { 
      IStrategoTerm c_145 = null;
      IStrategoTerm b_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consid_1 != ((IStrategoAppl)term).getConstructor())
        break Fail252;
      b_145 = term.getSubterm(0);
      IStrategoList annos204 = term.getAnnotations();
      c_145 = annos204;
      term = s_28.invoke(context, b_145);
      if(term == null)
        break Fail252;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consid_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}