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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail141:
    { 
      IStrategoTerm j_114 = null;
      IStrategoTerm h_114 = null;
      IStrategoTerm i_114 = null;
      IStrategoTerm k_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      h_114 = term.getSubterm(0);
      i_114 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      j_114 = annos128;
      term = p_18.invoke(context, h_114);
      if(term == null)
        break Fail141;
      k_114 = term;
      term = q_18.invoke(context, i_114);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpQ_2, new IStrategoTerm[]{k_114, term}), checkListAnnos(termFactory, j_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}