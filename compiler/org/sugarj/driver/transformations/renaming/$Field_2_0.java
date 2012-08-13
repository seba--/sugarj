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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_20, Strategy z_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Field_2_0");
    Fail77:
    { 
      IStrategoTerm p_114 = null;
      IStrategoTerm n_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm s_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      n_114 = term.getSubterm(0);
      o_114 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      p_114 = annos58;
      term = y_20.invoke(context, n_114);
      if(term == null)
        break Fail77;
      s_114 = term;
      term = z_20.invoke(context, o_114);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consField_2, new IStrategoTerm[]{s_114, term}), checkListAnnos(termFactory, p_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}