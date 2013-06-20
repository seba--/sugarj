package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alias_2_0 extends Strategy 
{ 
  public static alias_2_0 instance = new alias_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_25, Strategy g_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alias_2_0");
    Fail175:
    { 
      IStrategoTerm o_129 = null;
      IStrategoTerm j_129 = null;
      IStrategoTerm l_129 = null;
      IStrategoTerm q_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consalias_2 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      j_129 = term.getSubterm(0);
      l_129 = term.getSubterm(1);
      IStrategoList annos144 = term.getAnnotations();
      o_129 = annos144;
      term = f_25.invoke(context, j_129);
      if(term == null)
        break Fail175;
      q_129 = term;
      term = g_25.invoke(context, l_129);
      if(term == null)
        break Fail175;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consalias_2, new IStrategoTerm[]{q_129, term}), checkListAnnos(termFactory, o_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}