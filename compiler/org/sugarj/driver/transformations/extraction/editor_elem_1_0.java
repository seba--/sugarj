package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class editor_elem_1_0 extends Strategy 
{ 
  public static editor_elem_1_0 instance = new editor_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_elem_1_0");
    Fail31:
    { 
      IStrategoTerm v_102 = null;
      IStrategoTerm u_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conseditor_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      u_102 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      v_102 = annos4;
      term = x_15.invoke(context, u_102);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conseditor_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}