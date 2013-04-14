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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_15, Strategy b_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail76:
    { 
      IStrategoTerm x_103 = null;
      IStrategoTerm v_103 = null;
      IStrategoTerm w_103 = null;
      IStrategoTerm z_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      v_103 = term.getSubterm(0);
      w_103 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      x_103 = annos67;
      term = a_15.invoke(context, v_103);
      if(term == null)
        break Fail76;
      z_103 = term;
      term = b_15.invoke(context, w_103);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCong_2, new IStrategoTerm[]{z_103, term}), checkListAnnos(termFactory, x_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}