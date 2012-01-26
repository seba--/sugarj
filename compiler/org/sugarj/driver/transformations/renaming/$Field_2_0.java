package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Field_2_0 extends Strategy 
{ 
  public static $Field_2_0 instance = new $Field_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14, Strategy z_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Field_2_0");
    Fail26:
    { 
      IStrategoTerm p_101 = null;
      IStrategoTerm n_101 = null;
      IStrategoTerm o_101 = null;
      IStrategoTerm q_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      n_101 = term.getSubterm(0);
      o_101 = term.getSubterm(1);
      IStrategoList annos17 = term.getAnnotations();
      p_101 = annos17;
      term = y_14.invoke(context, n_101);
      if(term == null)
        break Fail26;
      q_101 = term;
      term = z_14.invoke(context, o_101);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consField_2, new IStrategoTerm[]{q_101, term}), checkListAnnos(termFactory, p_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}