package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_rules_0_2 extends Strategy 
{ 
  public static rename_rules_0_2 instance = new rename_rules_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_22, IStrategoTerm ref_x_22)
  { 
    TermReference w_22 = new TermReference(ref_w_22);
    TermReference x_22 = new TermReference(ref_x_22);
    context.push("rename_rules_0_2");
    Fail0:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.w_22 = w_22;
      lifted00.x_22 = x_22;
      term = topdown_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail0;
      lifted2 lifted20 = new lifted2();
      lifted20.w_22 = w_22;
      lifted20.x_22 = x_22;
      term = topdown_1_0.instance.invoke(context, term, lifted20);
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