package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Q_2_0 extends Strategy 
{ 
  public static $Op$Q_2_0 instance = new $Op$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_346, Strategy p_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail963:
    { 
      IStrategoTerm f_457 = null;
      IStrategoTerm d_457 = null;
      IStrategoTerm e_457 = null;
      IStrategoTerm g_457 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail963;
      d_457 = term.getSubterm(0);
      e_457 = term.getSubterm(1);
      IStrategoList annos205 = term.getAnnotations();
      f_457 = annos205;
      term = o_346.invoke(context, d_457);
      if(term == null)
        break Fail963;
      g_457 = term;
      term = p_346.invoke(context, e_457);
      if(term == null)
        break Fail963;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOpQ_2, new IStrategoTerm[]{g_457, term}), checkListAnnos(termFactory, f_457));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}