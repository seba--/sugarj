package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_8, IStrategoTerm ref_a_9)
  { 
    TermReference z_8 = new TermReference(ref_z_8);
    TermReference a_9 = new TermReference(ref_a_9);
    context.push("rename_rules_0_2");
    Fail0:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.z_8 = z_8;
      lifted00.a_9 = a_9;
      term = topdown_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail0;
      lifted2 lifted20 = new lifted2();
      lifted20.z_8 = z_8;
      lifted20.a_9 = a_9;
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