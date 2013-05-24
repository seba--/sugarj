package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_345, Strategy h_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail937:
    { 
      IStrategoTerm s_453 = null;
      IStrategoTerm q_453 = null;
      IStrategoTerm r_453 = null;
      IStrategoTerm t_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail937;
      q_453 = term.getSubterm(0);
      r_453 = term.getSubterm(1);
      IStrategoList annos182 = term.getAnnotations();
      s_453 = annos182;
      term = g_345.invoke(context, q_453);
      if(term == null)
        break Fail937;
      t_453 = term;
      term = h_345.invoke(context, r_453);
      if(term == null)
        break Fail937;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consListTail_2, new IStrategoTerm[]{t_453, term}), checkListAnnos(termFactory, s_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}