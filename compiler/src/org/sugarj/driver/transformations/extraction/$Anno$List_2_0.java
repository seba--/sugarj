package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$List_2_0 extends Strategy 
{ 
  public static $Anno$List_2_0 instance = new $Anno$List_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_24, Strategy k_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail159:
    { 
      IStrategoTerm w_126 = null;
      IStrategoTerm u_126 = null;
      IStrategoTerm v_126 = null;
      IStrategoTerm x_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      u_126 = term.getSubterm(0);
      v_126 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      w_126 = annos128;
      term = j_24.invoke(context, u_126);
      if(term == null)
        break Fail159;
      x_126 = term;
      term = k_24.invoke(context, v_126);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAnnoList_2, new IStrategoTerm[]{x_126, term}), checkListAnnos(termFactory, w_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}