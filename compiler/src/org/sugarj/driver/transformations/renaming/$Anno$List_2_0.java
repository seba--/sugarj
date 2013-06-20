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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail132:
    { 
      IStrategoTerm y_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm x_112 = null;
      IStrategoTerm z_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      w_112 = term.getSubterm(0);
      x_112 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      y_112 = annos119;
      term = c_18.invoke(context, w_112);
      if(term == null)
        break Fail132;
      z_112 = term;
      term = d_18.invoke(context, x_112);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoList_2, new IStrategoTerm[]{z_112, term}), checkListAnnos(termFactory, y_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}