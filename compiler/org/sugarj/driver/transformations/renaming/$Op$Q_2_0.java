package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_48, Strategy x_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail375:
    { 
      IStrategoTerm k_198 = null;
      IStrategoTerm i_198 = null;
      IStrategoTerm j_198 = null;
      IStrategoTerm l_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail375;
      i_198 = term.getSubterm(0);
      j_198 = term.getSubterm(1);
      IStrategoList annos318 = term.getAnnotations();
      k_198 = annos318;
      term = w_48.invoke(context, i_198);
      if(term == null)
        break Fail375;
      l_198 = term;
      term = x_48.invoke(context, j_198);
      if(term == null)
        break Fail375;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpQ_2, new IStrategoTerm[]{l_198, term}), checkListAnnos(termFactory, k_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}