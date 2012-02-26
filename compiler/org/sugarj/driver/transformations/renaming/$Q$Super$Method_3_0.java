package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Method_3_0 extends Strategy 
{ 
  public static $Q$Super$Method_3_0 instance = new $Q$Super$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_15, Strategy c_15, Strategy d_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperMethod_3_0");
    Fail23:
    { 
      IStrategoTerm a_101 = null;
      IStrategoTerm x_100 = null;
      IStrategoTerm y_100 = null;
      IStrategoTerm z_100 = null;
      IStrategoTerm b_101 = null;
      IStrategoTerm c_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      x_100 = term.getSubterm(0);
      y_100 = term.getSubterm(1);
      z_100 = term.getSubterm(2);
      IStrategoList annos11 = term.getAnnotations();
      a_101 = annos11;
      term = b_15.invoke(context, x_100);
      if(term == null)
        break Fail23;
      b_101 = term;
      term = c_15.invoke(context, y_100);
      if(term == null)
        break Fail23;
      c_101 = term;
      term = d_15.invoke(context, z_100);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperMethod_3, new IStrategoTerm[]{b_101, c_101, term}), checkListAnnos(termFactory, a_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}