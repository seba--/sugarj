package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_declarations_0_3 extends Strategy 
{ 
  public static rename_declarations_0_3 instance = new rename_declarations_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_14, IStrategoTerm ref_w_14, IStrategoTerm ref_x_14)
  { 
    TermReference v_14 = new TermReference(ref_v_14);
    TermReference w_14 = new TermReference(ref_w_14);
    TermReference x_14 = new TermReference(ref_x_14);
    context.push("rename_declarations_0_3");
    Fail1:
    { 
      lifted7 lifted70 = new lifted7();
      lifted70.v_14 = v_14;
      lifted70.w_14 = w_14;
      lifted70.x_14 = x_14;
      term = $Sugar$Compilation$Unit_3_0.instance.invoke(context, term, _Id.instance, _Id.instance, lifted70);
      if(term == null)
        break Fail1;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}