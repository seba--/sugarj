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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_15, Strategy o_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Field_2_0");
    Fail29:
    { 
      IStrategoTerm f_102 = null;
      IStrategoTerm d_102 = null;
      IStrategoTerm e_102 = null;
      IStrategoTerm g_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      d_102 = term.getSubterm(0);
      e_102 = term.getSubterm(1);
      IStrategoList annos17 = term.getAnnotations();
      f_102 = annos17;
      term = n_15.invoke(context, d_102);
      if(term == null)
        break Fail29;
      g_102 = term;
      term = o_15.invoke(context, e_102);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consField_2, new IStrategoTerm[]{g_102, term}), checkListAnnos(termFactory, f_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}