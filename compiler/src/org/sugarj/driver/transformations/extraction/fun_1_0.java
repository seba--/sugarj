package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fun_1_0 extends Strategy 
{ 
  public static fun_1_0 instance = new fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fun_1_0");
    Fail276:
    { 
      IStrategoTerm g_149 = null;
      IStrategoTerm f_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consfun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail276;
      f_149 = term.getSubterm(0);
      IStrategoList annos227 = term.getAnnotations();
      g_149 = annos227;
      term = s_29.invoke(context, f_149);
      if(term == null)
        break Fail276;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consfun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}