package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec_2_0 extends Strategy 
{ 
  public static $Enum$Dec_2_0 instance = new $Enum$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_23, Strategy f_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDec_2_0");
    Fail100:
    { 
      IStrategoTerm n_120 = null;
      IStrategoTerm l_120 = null;
      IStrategoTerm m_120 = null;
      IStrategoTerm o_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      l_120 = term.getSubterm(0);
      m_120 = term.getSubterm(1);
      IStrategoList annos81 = term.getAnnotations();
      n_120 = annos81;
      term = e_23.invoke(context, l_120);
      if(term == null)
        break Fail100;
      o_120 = term;
      term = f_23.invoke(context, m_120);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDec_2, new IStrategoTerm[]{o_120, term}), checkListAnnos(termFactory, n_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}