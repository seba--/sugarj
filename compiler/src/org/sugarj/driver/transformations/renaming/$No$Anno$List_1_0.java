package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Anno$List_1_0 extends Strategy 
{ 
  public static $No$Anno$List_1_0 instance = new $No$Anno$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail131:
    { 
      IStrategoTerm u_112 = null;
      IStrategoTerm t_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      t_112 = term.getSubterm(0);
      IStrategoList annos118 = term.getAnnotations();
      u_112 = annos118;
      term = b_18.invoke(context, t_112);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}