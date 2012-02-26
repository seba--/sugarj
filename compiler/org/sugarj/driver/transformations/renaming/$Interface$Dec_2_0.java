package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec_2_0 extends Strategy 
{ 
  public static $Interface$Dec_2_0 instance = new $Interface$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_16, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDec_2_0");
    Fail40:
    { 
      IStrategoTerm l_104 = null;
      IStrategoTerm j_104 = null;
      IStrategoTerm k_104 = null;
      IStrategoTerm m_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      j_104 = term.getSubterm(0);
      k_104 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      l_104 = annos28;
      term = j_16.invoke(context, j_104);
      if(term == null)
        break Fail40;
      m_104 = term;
      term = k_16.invoke(context, k_104);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDec_2, new IStrategoTerm[]{m_104, term}), checkListAnnos(termFactory, l_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}