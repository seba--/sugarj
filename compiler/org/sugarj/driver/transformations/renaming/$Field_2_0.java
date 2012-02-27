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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_15, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Field_2_0");
    Fail31:
    { 
      IStrategoTerm n_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm o_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      l_102 = term.getSubterm(0);
      m_102 = term.getSubterm(1);
      IStrategoList annos17 = term.getAnnotations();
      n_102 = annos17;
      term = v_15.invoke(context, l_102);
      if(term == null)
        break Fail31;
      o_102 = term;
      term = w_15.invoke(context, m_102);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consField_2, new IStrategoTerm[]{o_102, term}), checkListAnnos(termFactory, n_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}