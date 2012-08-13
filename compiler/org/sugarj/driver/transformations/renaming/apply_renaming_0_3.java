package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class apply_renaming_0_3 extends Strategy 
{ 
  public static apply_renaming_0_3 instance = new apply_renaming_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_14, IStrategoTerm ref_t_14, IStrategoTerm ref_u_14)
  { 
    TermReference s_14 = new TermReference(ref_s_14);
    TermReference t_14 = new TermReference(ref_t_14);
    TermReference u_14 = new TermReference(ref_u_14);
    context.push("apply_renaming_0_3");
    Fail0:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.s_14 = s_14;
      lifted00.t_14 = t_14;
      lifted00.u_14 = u_14;
      term = topdown_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}