package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class hiddens_1_0 extends Strategy 
{ 
  public static hiddens_1_0 instance = new hiddens_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("hiddens_1_0");
    Fail217:
    { 
      IStrategoTerm g_138 = null;
      IStrategoTerm f_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conshiddens_1 != ((IStrategoAppl)term).getConstructor())
        break Fail217;
      f_138 = term.getSubterm(0);
      IStrategoList annos177 = term.getAnnotations();
      g_138 = annos177;
      term = b_27.invoke(context, f_138);
      if(term == null)
        break Fail217;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conshiddens_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}