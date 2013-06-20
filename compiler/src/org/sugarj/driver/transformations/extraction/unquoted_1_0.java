package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unquoted_1_0 extends Strategy 
{ 
  public static unquoted_1_0 instance = new unquoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_1_0");
    Fail181:
    { 
      IStrategoTerm y_130 = null;
      IStrategoTerm x_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consunquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      x_130 = term.getSubterm(0);
      IStrategoList annos150 = term.getAnnotations();
      y_130 = annos150;
      term = p_25.invoke(context, x_130);
      if(term == null)
        break Fail181;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consunquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}