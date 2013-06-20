package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_20, Strategy j_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail90:
    { 
      IStrategoTerm d_115 = null;
      IStrategoTerm z_114 = null;
      IStrategoTerm a_115 = null;
      IStrategoTerm e_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      z_114 = term.getSubterm(0);
      a_115 = term.getSubterm(1);
      IStrategoList annos63 = term.getAnnotations();
      d_115 = annos63;
      term = i_20.invoke(context, z_114);
      if(term == null)
        break Fail90;
      e_115 = term;
      term = j_20.invoke(context, a_115);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleScope_2, new IStrategoTerm[]{e_115, term}), checkListAnnos(termFactory, d_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}