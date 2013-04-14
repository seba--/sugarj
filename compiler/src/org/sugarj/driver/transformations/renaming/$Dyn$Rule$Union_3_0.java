package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union_3_0 instance = new $Dyn$Rule$Union_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_13, Strategy o_13, Strategy p_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail57:
    { 
      IStrategoTerm d_100 = null;
      IStrategoTerm a_100 = null;
      IStrategoTerm b_100 = null;
      IStrategoTerm c_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm f_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      a_100 = term.getSubterm(0);
      b_100 = term.getSubterm(1);
      c_100 = term.getSubterm(2);
      IStrategoList annos48 = term.getAnnotations();
      d_100 = annos48;
      term = n_13.invoke(context, a_100);
      if(term == null)
        break Fail57;
      e_100 = term;
      term = o_13.invoke(context, b_100);
      if(term == null)
        break Fail57;
      f_100 = term;
      term = p_13.invoke(context, c_100);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnion_3, new IStrategoTerm[]{e_100, f_100, term}), checkListAnnos(termFactory, d_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}