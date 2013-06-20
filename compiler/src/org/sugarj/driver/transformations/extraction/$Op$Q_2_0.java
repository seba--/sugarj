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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_24, Strategy x_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail168:
    { 
      IStrategoTerm i_128 = null;
      IStrategoTerm g_128 = null;
      IStrategoTerm h_128 = null;
      IStrategoTerm j_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      g_128 = term.getSubterm(0);
      h_128 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      i_128 = annos137;
      term = w_24.invoke(context, g_128);
      if(term == null)
        break Fail168;
      j_128 = term;
      term = x_24.invoke(context, h_128);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOpQ_2, new IStrategoTerm[]{j_128, term}), checkListAnnos(termFactory, i_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}