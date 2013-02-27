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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18, Strategy c_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail136:
    { 
      IStrategoTerm f_113 = null;
      IStrategoTerm d_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm g_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      d_113 = term.getSubterm(0);
      e_113 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      f_113 = annos122;
      term = b_18.invoke(context, d_113);
      if(term == null)
        break Fail136;
      g_113 = term;
      term = c_18.invoke(context, e_113);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListTail_2, new IStrategoTerm[]{g_113, term}), checkListAnnos(termFactory, f_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}