package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_variables_1_0");
    Fail40:
    { 
      IStrategoTerm e_108 = null;
      IStrategoTerm d_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conslexical_variables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      d_108 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      e_108 = annos22;
      term = s_18.invoke(context, d_108);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conslexical_variables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}