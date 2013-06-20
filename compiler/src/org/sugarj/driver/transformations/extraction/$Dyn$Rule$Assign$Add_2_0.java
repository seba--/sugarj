package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign$Add_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign$Add_2_0 instance = new $Dyn$Rule$Assign$Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_16, Strategy z_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail46:
    { 
      IStrategoTerm r_105 = null;
      IStrategoTerm o_105 = null;
      IStrategoTerm p_105 = null;
      IStrategoTerm s_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      o_105 = term.getSubterm(0);
      p_105 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      r_105 = annos19;
      term = y_16.invoke(context, o_105);
      if(term == null)
        break Fail46;
      s_105 = term;
      term = z_16.invoke(context, p_105);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleAssignAdd_2, new IStrategoTerm[]{s_105, term}), checkListAnnos(termFactory, r_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}