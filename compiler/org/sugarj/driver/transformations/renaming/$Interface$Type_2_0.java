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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_25, Strategy f_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceType_2_0");
    Fail155:
    { 
      IStrategoTerm p_128 = null;
      IStrategoTerm l_128 = null;
      IStrategoTerm m_128 = null;
      IStrategoTerm q_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail155;
      l_128 = term.getSubterm(0);
      m_128 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      p_128 = annos136;
      term = e_25.invoke(context, l_128);
      if(term == null)
        break Fail155;
      q_128 = term;
      term = f_25.invoke(context, m_128);
      if(term == null)
        break Fail155;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceType_2, new IStrategoTerm[]{q_128, term}), checkListAnnos(termFactory, p_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}