package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Instance_4_0 extends Strategy 
{ 
  public static $New$Instance_4_0 instance = new $New$Instance_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_30, Strategy f_30, Strategy g_30, Strategy h_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewInstance_4_0");
    Fail196:
    { 
      IStrategoTerm b_146 = null;
      IStrategoTerm w_145 = null;
      IStrategoTerm y_145 = null;
      IStrategoTerm z_145 = null;
      IStrategoTerm a_146 = null;
      IStrategoTerm c_146 = null;
      IStrategoTerm e_146 = null;
      IStrategoTerm f_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewInstance_4 != ((IStrategoAppl)term).getConstructor())
        break Fail196;
      w_145 = term.getSubterm(0);
      y_145 = term.getSubterm(1);
      z_145 = term.getSubterm(2);
      a_146 = term.getSubterm(3);
      IStrategoList annos171 = term.getAnnotations();
      b_146 = annos171;
      term = e_30.invoke(context, w_145);
      if(term == null)
        break Fail196;
      c_146 = term;
      term = f_30.invoke(context, y_145);
      if(term == null)
        break Fail196;
      e_146 = term;
      term = g_30.invoke(context, z_145);
      if(term == null)
        break Fail196;
      f_146 = term;
      term = h_30.invoke(context, a_146);
      if(term == null)
        break Fail196;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewInstance_4, new IStrategoTerm[]{c_146, e_146, f_146, term}), checkListAnnos(termFactory, b_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}