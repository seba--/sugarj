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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_9, IStrategoTerm ref_f_9)
  { 
    TermReference e_9 = new TermReference(ref_e_9);
    TermReference f_9 = new TermReference(ref_f_9);
    context.push("rename_rules_0_2");
    Fail3:
    { 
      term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
      if(term == null)
        break Fail3;
      lifted2 lifted20 = new lifted2();
      lifted20.e_9 = e_9;
      lifted20.f_9 = f_9;
      term = topdown_1_0.instance.invoke(context, term, lifted20);
      if(term == null)
        break Fail3;
      lifted4 lifted40 = new lifted4();
      lifted40.e_9 = e_9;
      lifted40.f_9 = f_9;
      term = topdown_1_0.instance.invoke(context, term, lifted40);
      if(term == null)
        break Fail3;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}