package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class replace_name_0_2 extends Strategy 
{ 
  public static replace_name_0_2 instance = new replace_name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_9, IStrategoTerm ref_r_9)
  { 
    TermReference r_9 = new TermReference(ref_r_9);
    context.push("replace_name_0_2");
    Fail9:
    { 
      lifted20 lifted200 = new lifted20();
      lifted200.r_9 = r_9;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted200);
      if(term == null)
        break Fail9;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}