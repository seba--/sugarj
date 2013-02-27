package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope_2_0 instance = new $Dyn$Rule$Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_13, Strategy w_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail64:
    { 
      IStrategoTerm e_101 = null;
      IStrategoTerm c_101 = null;
      IStrategoTerm d_101 = null;
      IStrategoTerm f_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      c_101 = term.getSubterm(0);
      d_101 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      e_101 = annos54;
      term = v_13.invoke(context, c_101);
      if(term == null)
        break Fail64;
      f_101 = term;
      term = w_13.invoke(context, d_101);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScope_2, new IStrategoTerm[]{f_101, term}), checkListAnnos(termFactory, e_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}