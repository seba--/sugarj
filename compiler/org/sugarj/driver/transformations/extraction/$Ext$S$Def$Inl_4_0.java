package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$S$Def$Inl_4_0 extends Strategy 
{ 
  public static $Ext$S$Def$Inl_4_0 instance = new $Ext$S$Def$Inl_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_347, Strategy e_347, Strategy f_347, Strategy g_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail969:
    { 
      IStrategoTerm r_458 = null;
      IStrategoTerm n_458 = null;
      IStrategoTerm o_458 = null;
      IStrategoTerm p_458 = null;
      IStrategoTerm q_458 = null;
      IStrategoTerm s_458 = null;
      IStrategoTerm t_458 = null;
      IStrategoTerm u_458 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail969;
      n_458 = term.getSubterm(0);
      o_458 = term.getSubterm(1);
      p_458 = term.getSubterm(2);
      q_458 = term.getSubterm(3);
      IStrategoList annos211 = term.getAnnotations();
      r_458 = annos211;
      term = d_347.invoke(context, n_458);
      if(term == null)
        break Fail969;
      s_458 = term;
      term = e_347.invoke(context, o_458);
      if(term == null)
        break Fail969;
      t_458 = term;
      term = f_347.invoke(context, p_458);
      if(term == null)
        break Fail969;
      u_458 = term;
      term = g_347.invoke(context, q_458);
      if(term == null)
        break Fail969;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtSDefInl_4, new IStrategoTerm[]{s_458, t_458, u_458, term}), checkListAnnos(termFactory, r_458));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}