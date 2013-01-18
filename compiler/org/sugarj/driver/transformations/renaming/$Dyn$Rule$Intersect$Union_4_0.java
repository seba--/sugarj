package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union_4_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union_4_0 instance = new $Dyn$Rule$Intersect$Union_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_43, Strategy v_43, Strategy w_43, Strategy x_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail293:
    { 
      IStrategoTerm a_184 = null;
      IStrategoTerm w_183 = null;
      IStrategoTerm x_183 = null;
      IStrategoTerm y_183 = null;
      IStrategoTerm z_183 = null;
      IStrategoTerm b_184 = null;
      IStrategoTerm c_184 = null;
      IStrategoTerm d_184 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail293;
      w_183 = term.getSubterm(0);
      x_183 = term.getSubterm(1);
      y_183 = term.getSubterm(2);
      z_183 = term.getSubterm(3);
      IStrategoList annos240 = term.getAnnotations();
      a_184 = annos240;
      term = u_43.invoke(context, w_183);
      if(term == null)
        break Fail293;
      b_184 = term;
      term = v_43.invoke(context, x_183);
      if(term == null)
        break Fail293;
      c_184 = term;
      term = w_43.invoke(context, y_183);
      if(term == null)
        break Fail293;
      d_184 = term;
      term = x_43.invoke(context, z_183);
      if(term == null)
        break Fail293;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnion_4, new IStrategoTerm[]{b_184, c_184, d_184, term}), checkListAnnos(termFactory, a_184));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}