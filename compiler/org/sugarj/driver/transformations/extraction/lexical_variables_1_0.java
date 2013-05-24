package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_variables_1_0 extends Strategy 
{ 
  public static lexical_variables_1_0 instance = new lexical_variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_variables_1_0");
    Fail743:
    { 
      IStrategoTerm o_425 = null;
      IStrategoTerm n_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslexical_variables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail743;
      n_425 = term.getSubterm(0);
      IStrategoList annos15 = term.getAnnotations();
      o_425 = annos15;
      term = g_334.invoke(context, n_425);
      if(term == null)
        break Fail743;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslexical_variables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}