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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_344, Strategy z_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail931:
    { 
      IStrategoTerm w_452 = null;
      IStrategoTerm u_452 = null;
      IStrategoTerm v_452 = null;
      IStrategoTerm x_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail931;
      u_452 = term.getSubterm(0);
      v_452 = term.getSubterm(1);
      IStrategoList annos176 = term.getAnnotations();
      w_452 = annos176;
      term = y_344.invoke(context, u_452);
      if(term == null)
        break Fail931;
      x_452 = term;
      term = z_344.invoke(context, v_452);
      if(term == null)
        break Fail931;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAnnoList_2, new IStrategoTerm[]{x_452, term}), checkListAnnos(termFactory, w_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}