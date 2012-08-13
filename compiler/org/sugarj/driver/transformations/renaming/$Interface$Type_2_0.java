package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Type_2_0 extends Strategy 
{ 
  public static $Interface$Type_2_0 instance = new $Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_30, Strategy q_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceType_2_0");
    Fail203:
    { 
      IStrategoTerm m_147 = null;
      IStrategoTerm k_147 = null;
      IStrategoTerm l_147 = null;
      IStrategoTerm n_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail203;
      k_147 = term.getSubterm(0);
      l_147 = term.getSubterm(1);
      IStrategoList annos177 = term.getAnnotations();
      m_147 = annos177;
      term = p_30.invoke(context, k_147);
      if(term == null)
        break Fail203;
      n_147 = term;
      term = q_30.invoke(context, l_147);
      if(term == null)
        break Fail203;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceType_2, new IStrategoTerm[]{n_147, term}), checkListAnnos(termFactory, m_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}