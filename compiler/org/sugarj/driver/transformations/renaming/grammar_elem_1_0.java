package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class grammar_elem_1_0 extends Strategy 
{ 
  public static grammar_elem_1_0 instance = new grammar_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail47:
    { 
      IStrategoTerm z_108 = null;
      IStrategoTerm y_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      y_108 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      z_108 = annos29;
      term = z_18.invoke(context, y_108);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}