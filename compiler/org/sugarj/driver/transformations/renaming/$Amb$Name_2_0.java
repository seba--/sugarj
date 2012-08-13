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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_31, Strategy q_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_2_0");
    Fail221:
    { 
      IStrategoTerm l_150 = null;
      IStrategoTerm j_150 = null;
      IStrategoTerm k_150 = null;
      IStrategoTerm m_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail221;
      j_150 = term.getSubterm(0);
      k_150 = term.getSubterm(1);
      IStrategoList annos195 = term.getAnnotations();
      l_150 = annos195;
      term = p_31.invoke(context, j_150);
      if(term == null)
        break Fail221;
      m_150 = term;
      term = q_31.invoke(context, k_150);
      if(term == null)
        break Fail221;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_2, new IStrategoTerm[]{m_150, term}), checkListAnnos(termFactory, l_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}