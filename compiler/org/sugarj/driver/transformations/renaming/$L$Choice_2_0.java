package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_15, Strategy x_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail93:
    { 
      IStrategoTerm k_106 = null;
      IStrategoTerm i_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm l_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      i_106 = term.getSubterm(0);
      j_106 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      k_106 = annos83;
      term = w_15.invoke(context, i_106);
      if(term == null)
        break Fail93;
      l_106 = term;
      term = x_15.invoke(context, j_106);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLChoice_2, new IStrategoTerm[]{l_106, term}), checkListAnnos(termFactory, k_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}