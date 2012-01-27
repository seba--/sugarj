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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_14, Strategy k_14, Strategy l_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenericMethod_3_0");
    Fail19:
    { 
      IStrategoTerm d_100 = null;
      IStrategoTerm a_100 = null;
      IStrategoTerm b_100 = null;
      IStrategoTerm c_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm f_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGenericMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      a_100 = term.getSubterm(0);
      b_100 = term.getSubterm(1);
      c_100 = term.getSubterm(2);
      IStrategoList annos10 = term.getAnnotations();
      d_100 = annos10;
      term = j_14.invoke(context, a_100);
      if(term == null)
        break Fail19;
      e_100 = term;
      term = k_14.invoke(context, b_100);
      if(term == null)
        break Fail19;
      f_100 = term;
      term = l_14.invoke(context, c_100);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGenericMethod_3, new IStrategoTerm[]{e_100, f_100, term}), checkListAnnos(termFactory, d_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}