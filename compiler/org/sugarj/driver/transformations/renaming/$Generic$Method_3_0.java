package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Generic$Method_3_0 extends Strategy 
{ 
  public static $Generic$Method_3_0 instance = new $Generic$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14, Strategy z_14, Strategy a_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenericMethod_3_0");
    Fail22:
    { 
      IStrategoTerm t_100 = null;
      IStrategoTerm q_100 = null;
      IStrategoTerm r_100 = null;
      IStrategoTerm s_100 = null;
      IStrategoTerm u_100 = null;
      IStrategoTerm v_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGenericMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      q_100 = term.getSubterm(0);
      r_100 = term.getSubterm(1);
      s_100 = term.getSubterm(2);
      IStrategoList annos10 = term.getAnnotations();
      t_100 = annos10;
      term = y_14.invoke(context, q_100);
      if(term == null)
        break Fail22;
      u_100 = term;
      term = z_14.invoke(context, r_100);
      if(term == null)
        break Fail22;
      v_100 = term;
      term = a_15.invoke(context, s_100);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGenericMethod_3, new IStrategoTerm[]{u_100, v_100, term}), checkListAnnos(termFactory, t_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}