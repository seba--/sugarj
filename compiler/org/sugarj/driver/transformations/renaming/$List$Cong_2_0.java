package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_14, Strategy v_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail77:
    { 
      IStrategoTerm r_103 = null;
      IStrategoTerm p_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm s_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      p_103 = term.getSubterm(0);
      q_103 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      r_103 = annos67;
      term = u_14.invoke(context, p_103);
      if(term == null)
        break Fail77;
      s_103 = term;
      term = v_14.invoke(context, q_103);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCong_2, new IStrategoTerm[]{s_103, term}), checkListAnnos(termFactory, r_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}