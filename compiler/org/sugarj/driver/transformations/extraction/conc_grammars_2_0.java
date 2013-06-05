package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_grammars_2_0 extends Strategy 
{ 
  public static conc_grammars_2_0 instance = new conc_grammars_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_29, Strategy k_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_grammars_2_0");
    Fail270:
    { 
      IStrategoTerm k_148 = null;
      IStrategoTerm i_148 = null;
      IStrategoTerm j_148 = null;
      IStrategoTerm l_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consconc_grammars_2 != ((IStrategoAppl)term).getConstructor())
        break Fail270;
      i_148 = term.getSubterm(0);
      j_148 = term.getSubterm(1);
      IStrategoList annos222 = term.getAnnotations();
      k_148 = annos222;
      term = j_29.invoke(context, i_148);
      if(term == null)
        break Fail270;
      l_148 = term;
      term = k_29.invoke(context, j_148);
      if(term == null)
        break Fail270;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consconc_grammars_2, new IStrategoTerm[]{l_148, term}), checkListAnnos(termFactory, k_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}