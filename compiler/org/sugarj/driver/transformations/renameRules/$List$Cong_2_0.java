package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong_2_0 extends Strategy 
{ 
  public static $List$Cong_2_0 instance = new $List$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_14, Strategy w_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail73:
    { 
      IStrategoTerm s_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      IStrategoTerm t_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      q_103 = term.getSubterm(0);
      r_103 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      s_103 = annos67;
      term = v_14.invoke(context, q_103);
      if(term == null)
        break Fail73;
      t_103 = term;
      term = w_14.invoke(context, r_103);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCong_2, new IStrategoTerm[]{t_103, term}), checkListAnnos(termFactory, s_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}