package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_346, Strategy s_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail965:
    { 
      IStrategoTerm n_457 = null;
      IStrategoTerm l_457 = null;
      IStrategoTerm m_457 = null;
      IStrategoTerm o_457 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail965;
      l_457 = term.getSubterm(0);
      m_457 = term.getSubterm(1);
      IStrategoList annos207 = term.getAnnotations();
      n_457 = annos207;
      term = r_346.invoke(context, l_457);
      if(term == null)
        break Fail965;
      o_457 = term;
      term = s_346.invoke(context, m_457);
      if(term == null)
        break Fail965;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLet_2, new IStrategoTerm[]{o_457, term}), checkListAnnos(termFactory, n_457));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}