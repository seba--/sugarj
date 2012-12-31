package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule_2_0 instance = new $Set$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_10, Strategy v_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail20:
    { 
      IStrategoTerm j_92 = null;
      IStrategoTerm h_92 = null;
      IStrategoTerm i_92 = null;
      IStrategoTerm k_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      h_92 = term.getSubterm(0);
      i_92 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      j_92 = annos14;
      term = u_10.invoke(context, h_92);
      if(term == null)
        break Fail20;
      k_92 = term;
      term = v_10.invoke(context, i_92);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRule_2, new IStrategoTerm[]{k_92, term}), checkListAnnos(termFactory, j_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}