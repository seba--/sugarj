package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param_3_0 extends Strategy 
{ 
  public static $Param_3_0 instance = new $Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18, Strategy e_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_3_0");
    Fail61:
    { 
      IStrategoTerm u_109 = null;
      IStrategoTerm r_109 = null;
      IStrategoTerm s_109 = null;
      IStrategoTerm t_109 = null;
      IStrategoTerm v_109 = null;
      IStrategoTerm w_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      r_109 = term.getSubterm(0);
      s_109 = term.getSubterm(1);
      t_109 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      u_109 = annos51;
      term = c_18.invoke(context, r_109);
      if(term == null)
        break Fail61;
      v_109 = term;
      term = d_18.invoke(context, s_109);
      if(term == null)
        break Fail61;
      w_109 = term;
      term = e_18.invoke(context, t_109);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consParam_3, new IStrategoTerm[]{v_109, w_109, term}), checkListAnnos(termFactory, u_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}