package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_340, Strategy w_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail871:
    { 
      IStrategoTerm j_442 = null;
      IStrategoTerm h_442 = null;
      IStrategoTerm i_442 = null;
      IStrategoTerm k_442 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail871;
      h_442 = term.getSubterm(0);
      i_442 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      j_442 = annos117;
      term = v_340.invoke(context, h_442);
      if(term == null)
        break Fail871;
      k_442 = term;
      term = w_340.invoke(context, i_442);
      if(term == null)
        break Fail871;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDec_2, new IStrategoTerm[]{k_442, term}), checkListAnnos(termFactory, j_442));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}