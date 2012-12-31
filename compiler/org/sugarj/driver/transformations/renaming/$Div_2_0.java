package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_37, Strategy n_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail171:
    { 
      IStrategoTerm s_164 = null;
      IStrategoTerm n_164 = null;
      IStrategoTerm o_164 = null;
      IStrategoTerm t_164 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      n_164 = term.getSubterm(0);
      o_164 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      s_164 = annos141;
      term = m_37.invoke(context, n_164);
      if(term == null)
        break Fail171;
      t_164 = term;
      term = n_37.invoke(context, o_164);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDiv_2, new IStrategoTerm[]{t_164, term}), checkListAnnos(termFactory, s_164));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}