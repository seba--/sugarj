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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_variables_1_0");
    Fail254:
    { 
      IStrategoTerm k_147 = null;
      IStrategoTerm j_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslexical_variables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      j_147 = term.getSubterm(0);
      IStrategoList annos209 = term.getAnnotations();
      k_147 = annos209;
      term = f_29.invoke(context, j_147);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslexical_variables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}