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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_48, Strategy l_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail367:
    { 
      IStrategoTerm a_197 = null;
      IStrategoTerm y_196 = null;
      IStrategoTerm z_196 = null;
      IStrategoTerm b_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail367;
      y_196 = term.getSubterm(0);
      z_196 = term.getSubterm(1);
      IStrategoList annos310 = term.getAnnotations();
      a_197 = annos310;
      term = k_48.invoke(context, y_196);
      if(term == null)
        break Fail367;
      b_197 = term;
      term = l_48.invoke(context, z_196);
      if(term == null)
        break Fail367;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoList_2, new IStrategoTerm[]{b_197, term}), checkListAnnos(termFactory, a_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}