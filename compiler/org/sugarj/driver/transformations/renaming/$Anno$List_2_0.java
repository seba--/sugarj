package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17, Strategy a_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail133:
    { 
      IStrategoTerm v_112 = null;
      IStrategoTerm t_112 = null;
      IStrategoTerm u_112 = null;
      IStrategoTerm w_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      t_112 = term.getSubterm(0);
      u_112 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      v_112 = annos119;
      term = z_17.invoke(context, t_112);
      if(term == null)
        break Fail133;
      w_112 = term;
      term = a_18.invoke(context, u_112);
      if(term == null)
        break Fail133;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoList_2, new IStrategoTerm[]{w_112, term}), checkListAnnos(termFactory, v_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}