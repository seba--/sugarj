package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_java_0_3 extends Strategy 
{ 
  public static rename_java_0_3 instance = new rename_java_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_12, IStrategoTerm ref_m_12, IStrategoTerm ref_n_12)
  { 
    TermReference l_12 = new TermReference(ref_l_12);
    TermReference m_12 = new TermReference(ref_m_12);
    TermReference n_12 = new TermReference(ref_n_12);
    context.push("rename_java_0_3");
    Fail0:
    { 
      lifted6 lifted65 = new lifted6();
      lifted65.l_12 = l_12;
      lifted65.m_12 = m_12;
      lifted65.n_12 = n_12;
      term = topdown_1_0.instance.invoke(context, term, lifted65);
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