package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Generic$Method_3_0 extends Strategy 
{ 
  public static $Generic$Method_3_0 instance = new $Generic$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_15, Strategy h_15, Strategy i_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenericMethod_3_0");
    Fail24:
    { 
      IStrategoTerm b_101 = null;
      IStrategoTerm y_100 = null;
      IStrategoTerm z_100 = null;
      IStrategoTerm a_101 = null;
      IStrategoTerm c_101 = null;
      IStrategoTerm d_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGenericMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      y_100 = term.getSubterm(0);
      z_100 = term.getSubterm(1);
      a_101 = term.getSubterm(2);
      IStrategoList annos10 = term.getAnnotations();
      b_101 = annos10;
      term = g_15.invoke(context, y_100);
      if(term == null)
        break Fail24;
      c_101 = term;
      term = h_15.invoke(context, z_100);
      if(term == null)
        break Fail24;
      d_101 = term;
      term = i_15.invoke(context, a_101);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGenericMethod_3, new IStrategoTerm[]{c_101, d_101, term}), checkListAnnos(termFactory, b_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}