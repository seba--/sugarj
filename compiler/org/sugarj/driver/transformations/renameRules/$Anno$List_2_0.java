package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_17, Strategy y_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail129:
    { 
      IStrategoTerm t_112 = null;
      IStrategoTerm r_112 = null;
      IStrategoTerm s_112 = null;
      IStrategoTerm u_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      r_112 = term.getSubterm(0);
      s_112 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      t_112 = annos119;
      term = x_17.invoke(context, r_112);
      if(term == null)
        break Fail129;
      u_112 = term;
      term = y_17.invoke(context, s_112);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoList_2, new IStrategoTerm[]{u_112, term}), checkListAnnos(termFactory, t_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}