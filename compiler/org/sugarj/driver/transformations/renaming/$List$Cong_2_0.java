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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_14, Strategy y_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail77:
    { 
      IStrategoTerm u_103 = null;
      IStrategoTerm s_103 = null;
      IStrategoTerm t_103 = null;
      IStrategoTerm v_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      s_103 = term.getSubterm(0);
      t_103 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      u_103 = annos67;
      term = x_14.invoke(context, s_103);
      if(term == null)
        break Fail77;
      v_103 = term;
      term = y_14.invoke(context, t_103);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCong_2, new IStrategoTerm[]{v_103, term}), checkListAnnos(termFactory, u_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}