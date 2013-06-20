package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamings_1_0 extends Strategy 
{ 
  public static renamings_1_0 instance = new renamings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamings_1_0");
    Fail222:
    { 
      IStrategoTerm g_139 = null;
      IStrategoTerm f_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consrenamings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail222;
      f_139 = term.getSubterm(0);
      IStrategoList annos182 = term.getAnnotations();
      g_139 = annos182;
      term = k_27.invoke(context, f_139);
      if(term == null)
        break Fail222;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consrenamings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}