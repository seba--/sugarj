package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail132:
    { 
      IStrategoTerm g_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm i_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      e_113 = term.getSubterm(0);
      f_113 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      g_113 = annos122;
      term = c_18.invoke(context, e_113);
      if(term == null)
        break Fail132;
      i_113 = term;
      term = d_18.invoke(context, f_113);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListTail_2, new IStrategoTerm[]{i_113, term}), checkListAnnos(termFactory, g_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}