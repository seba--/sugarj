package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_347, Strategy q_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail977:
    { 
      IStrategoTerm t_459 = null;
      IStrategoTerm r_459 = null;
      IStrategoTerm s_459 = null;
      IStrategoTerm u_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail977;
      r_459 = term.getSubterm(0);
      s_459 = term.getSubterm(1);
      IStrategoList annos217 = term.getAnnotations();
      t_459 = annos217;
      term = p_347.invoke(context, r_459);
      if(term == null)
        break Fail977;
      u_459 = term;
      term = q_347.invoke(context, s_459);
      if(term == null)
        break Fail977;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consScope_2, new IStrategoTerm[]{u_459, term}), checkListAnnos(termFactory, t_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}