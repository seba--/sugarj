package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Depends_3_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Depends_3_0 instance = new $Set$Dyn$Rule$Depends_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_41, Strategy c_41, Strategy d_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail256:
    { 
      IStrategoTerm c_176 = null;
      IStrategoTerm z_175 = null;
      IStrategoTerm a_176 = null;
      IStrategoTerm b_176 = null;
      IStrategoTerm d_176 = null;
      IStrategoTerm e_176 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail256;
      z_175 = term.getSubterm(0);
      a_176 = term.getSubterm(1);
      b_176 = term.getSubterm(2);
      IStrategoList annos203 = term.getAnnotations();
      c_176 = annos203;
      term = b_41.invoke(context, z_175);
      if(term == null)
        break Fail256;
      d_176 = term;
      term = c_41.invoke(context, a_176);
      if(term == null)
        break Fail256;
      e_176 = term;
      term = d_41.invoke(context, b_176);
      if(term == null)
        break Fail256;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleDepends_3, new IStrategoTerm[]{d_176, e_176, term}), checkListAnnos(termFactory, c_176));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}