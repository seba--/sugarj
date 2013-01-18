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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail366:
    { 
      IStrategoTerm u_196 = null;
      IStrategoTerm t_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail366;
      t_196 = term.getSubterm(0);
      IStrategoList annos309 = term.getAnnotations();
      u_196 = annos309;
      term = j_48.invoke(context, t_196);
      if(term == null)
        break Fail366;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}