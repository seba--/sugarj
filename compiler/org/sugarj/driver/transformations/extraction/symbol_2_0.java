package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class symbol_2_0 extends Strategy 
{ 
  public static symbol_2_0 instance = new symbol_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_350, Strategy y_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("symbol_2_0");
    Fail1047:
    { 
      IStrategoTerm o_468 = null;
      IStrategoTerm m_468 = null;
      IStrategoTerm n_468 = null;
      IStrategoTerm p_468 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssymbol_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1047;
      m_468 = term.getSubterm(0);
      n_468 = term.getSubterm(1);
      IStrategoList annos274 = term.getAnnotations();
      o_468 = annos274;
      term = x_350.invoke(context, m_468);
      if(term == null)
        break Fail1047;
      p_468 = term;
      term = y_350.invoke(context, n_468);
      if(term == null)
        break Fail1047;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssymbol_2, new IStrategoTerm[]{p_468, term}), checkListAnnos(termFactory, o_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}