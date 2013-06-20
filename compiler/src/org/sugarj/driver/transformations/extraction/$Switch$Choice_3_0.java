package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice_3_0 extends Strategy 
{ 
  public static $Switch$Choice_3_0 instance = new $Switch$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_20, Strategy p_20, Strategy q_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail93:
    { 
      IStrategoTerm u_115 = null;
      IStrategoTerm r_115 = null;
      IStrategoTerm s_115 = null;
      IStrategoTerm t_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm w_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      r_115 = term.getSubterm(0);
      s_115 = term.getSubterm(1);
      t_115 = term.getSubterm(2);
      IStrategoList annos66 = term.getAnnotations();
      u_115 = annos66;
      term = o_20.invoke(context, r_115);
      if(term == null)
        break Fail93;
      v_115 = term;
      term = p_20.invoke(context, s_115);
      if(term == null)
        break Fail93;
      w_115 = term;
      term = q_20.invoke(context, t_115);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSwitchChoice_3, new IStrategoTerm[]{v_115, w_115, term}), checkListAnnos(termFactory, u_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}