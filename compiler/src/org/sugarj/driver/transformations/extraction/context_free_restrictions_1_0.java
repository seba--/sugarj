package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_restrictions_1_0 extends Strategy 
{ 
  public static context_free_restrictions_1_0 instance = new context_free_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_restrictions_1_0");
    Fail254:
    { 
      IStrategoTerm w_145 = null;
      IStrategoTerm v_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscontext_free_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      v_145 = term.getSubterm(0);
      IStrategoList annos206 = term.getAnnotations();
      w_145 = annos206;
      term = u_28.invoke(context, v_145);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscontext_free_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}