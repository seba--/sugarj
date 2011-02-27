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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_27, Strategy i_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("symbol_2_0");
    Fail208:
    { 
      IStrategoTerm u_138 = null;
      IStrategoTerm p_138 = null;
      IStrategoTerm q_138 = null;
      IStrategoTerm v_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssymbol_2 != ((IStrategoAppl)term).getConstructor())
        break Fail208;
      p_138 = term.getSubterm(0);
      q_138 = term.getSubterm(1);
      IStrategoList annos172 = term.getAnnotations();
      u_138 = annos172;
      term = h_27.invoke(context, p_138);
      if(term == null)
        break Fail208;
      v_138 = term;
      term = i_27.invoke(context, q_138);
      if(term == null)
        break Fail208;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssymbol_2, new IStrategoTerm[]{v_138, term}), checkListAnnos(termFactory, u_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}