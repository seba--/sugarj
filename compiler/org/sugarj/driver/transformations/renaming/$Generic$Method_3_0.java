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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_20, Strategy k_20, Strategy l_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenericMethod_3_0");
    Fail70:
    { 
      IStrategoTerm d_113 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm c_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGenericMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      a_113 = term.getSubterm(0);
      b_113 = term.getSubterm(1);
      c_113 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      d_113 = annos51;
      term = j_20.invoke(context, a_113);
      if(term == null)
        break Fail70;
      e_113 = term;
      term = k_20.invoke(context, b_113);
      if(term == null)
        break Fail70;
      f_113 = term;
      term = l_20.invoke(context, c_113);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGenericMethod_3, new IStrategoTerm[]{e_113, f_113, term}), checkListAnnos(termFactory, d_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}