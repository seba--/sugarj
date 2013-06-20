package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def_3_0 extends Strategy 
{ 
  public static $S$Def_3_0 instance = new $S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_19, Strategy b_19, Strategy c_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail78:
    { 
      IStrategoTerm u_111 = null;
      IStrategoTerm r_111 = null;
      IStrategoTerm s_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm v_111 = null;
      IStrategoTerm w_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      r_111 = term.getSubterm(0);
      s_111 = term.getSubterm(1);
      t_111 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      u_111 = annos51;
      term = a_19.invoke(context, r_111);
      if(term == null)
        break Fail78;
      v_111 = term;
      term = b_19.invoke(context, s_111);
      if(term == null)
        break Fail78;
      w_111 = term;
      term = c_19.invoke(context, t_111);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSDef_3, new IStrategoTerm[]{v_111, w_111, term}), checkListAnnos(termFactory, u_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}