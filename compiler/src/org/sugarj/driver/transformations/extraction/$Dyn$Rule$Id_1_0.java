package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Id_1_0 instance = new $Dyn$Rule$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail42:
    { 
      IStrategoTerm v_104 = null;
      IStrategoTerm u_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      u_104 = term.getSubterm(0);
      IStrategoList annos15 = term.getAnnotations();
      v_104 = annos15;
      term = q_16.invoke(context, u_104);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}