package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Body_2_0 extends Strategy 
{ 
  public static $Enum$Body_2_0 instance = new $Enum$Body_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_31, Strategy i_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBody_2_0");
    Fail88:
    { 
      IStrategoTerm n_142 = null;
      IStrategoTerm k_142 = null;
      IStrategoTerm m_142 = null;
      IStrategoTerm o_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEnumBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      k_142 = term.getSubterm(0);
      m_142 = term.getSubterm(1);
      IStrategoList annos64 = term.getAnnotations();
      n_142 = annos64;
      term = h_31.invoke(context, k_142);
      if(term == null)
        break Fail88;
      o_142 = term;
      term = i_31.invoke(context, m_142);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEnumBody_2, new IStrategoTerm[]{o_142, term}), checkListAnnos(termFactory, n_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}