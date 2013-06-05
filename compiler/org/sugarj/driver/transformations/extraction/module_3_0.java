package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_3_0 extends Strategy 
{ 
  public static module_3_0 instance = new module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_27, Strategy c_27, Strategy d_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_3_0");
    Fail218:
    { 
      IStrategoTerm j_138 = null;
      IStrategoTerm g_138 = null;
      IStrategoTerm h_138 = null;
      IStrategoTerm i_138 = null;
      IStrategoTerm k_138 = null;
      IStrategoTerm l_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consmodule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      g_138 = term.getSubterm(0);
      h_138 = term.getSubterm(1);
      i_138 = term.getSubterm(2);
      IStrategoList annos178 = term.getAnnotations();
      j_138 = annos178;
      term = b_27.invoke(context, g_138);
      if(term == null)
        break Fail218;
      k_138 = term;
      term = c_27.invoke(context, h_138);
      if(term == null)
        break Fail218;
      l_138 = term;
      term = d_27.invoke(context, i_138);
      if(term == null)
        break Fail218;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consmodule_3, new IStrategoTerm[]{k_138, l_138, term}), checkListAnnos(termFactory, j_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}