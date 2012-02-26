package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_2_0 extends Strategy 
{ 
  public static $Amb$Name_2_0 instance = new $Amb$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_26, Strategy f_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_2_0");
    Fail173:
    { 
      IStrategoTerm o_132 = null;
      IStrategoTerm k_132 = null;
      IStrategoTerm m_132 = null;
      IStrategoTerm r_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      k_132 = term.getSubterm(0);
      m_132 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      o_132 = annos154;
      term = e_26.invoke(context, k_132);
      if(term == null)
        break Fail173;
      r_132 = term;
      term = f_26.invoke(context, m_132);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_2, new IStrategoTerm[]{r_132, term}), checkListAnnos(termFactory, o_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}