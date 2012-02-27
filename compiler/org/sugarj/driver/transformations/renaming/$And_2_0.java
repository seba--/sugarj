package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_22, Strategy y_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail120:
    { 
      IStrategoTerm o_121 = null;
      IStrategoTerm m_121 = null;
      IStrategoTerm n_121 = null;
      IStrategoTerm p_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      m_121 = term.getSubterm(0);
      n_121 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      o_121 = annos100;
      term = x_22.invoke(context, m_121);
      if(term == null)
        break Fail120;
      p_121 = term;
      term = y_22.invoke(context, n_121);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnd_2, new IStrategoTerm[]{p_121, term}), checkListAnnos(termFactory, o_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}