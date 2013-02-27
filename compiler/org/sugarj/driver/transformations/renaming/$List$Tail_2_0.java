package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Tail_2_0 extends Strategy 
{ 
  public static $List$Tail_2_0 instance = new $List$Tail_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_18, Strategy f_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail136:
    { 
      IStrategoTerm j_113 = null;
      IStrategoTerm g_113 = null;
      IStrategoTerm i_113 = null;
      IStrategoTerm k_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      g_113 = term.getSubterm(0);
      i_113 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      j_113 = annos122;
      term = e_18.invoke(context, g_113);
      if(term == null)
        break Fail136;
      k_113 = term;
      term = f_18.invoke(context, i_113);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListTail_2, new IStrategoTerm[]{k_113, term}), checkListAnnos(termFactory, j_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}