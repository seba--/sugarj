package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union$Fix_2_0 instance = new $Dyn$Rule$Union$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_44, Strategy i_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail297:
    { 
      IStrategoTerm c_185 = null;
      IStrategoTerm a_185 = null;
      IStrategoTerm b_185 = null;
      IStrategoTerm d_185 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail297;
      a_185 = term.getSubterm(0);
      b_185 = term.getSubterm(1);
      IStrategoList annos244 = term.getAnnotations();
      c_185 = annos244;
      term = h_44.invoke(context, a_185);
      if(term == null)
        break Fail297;
      d_185 = term;
      term = i_44.invoke(context, b_185);
      if(term == null)
        break Fail297;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnionFix_2, new IStrategoTerm[]{d_185, term}), checkListAnnos(termFactory, c_185));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}