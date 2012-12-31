package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  TermReference r_23;

  TermReference s_23;

  TermReference t_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail381:
    { 
      lifted6 lifted60 = new lifted6();
      lifted60.r_23 = r_23;
      lifted60.s_23 = s_23;
      lifted60.t_23 = t_23;
      term = try_1_0.instance.invoke(context, term, lifted60);
      if(term == null)
        break Fail381;
      lifted7 lifted70 = new lifted7();
      lifted70.s_23 = s_23;
      lifted70.t_23 = t_23;
      term = try_1_0.instance.invoke(context, term, lifted70);
      if(term == null)
        break Fail381;
      lifted8 lifted80 = new lifted8();
      lifted80.s_23 = s_23;
      lifted80.t_23 = t_23;
      term = try_1_0.instance.invoke(context, term, lifted80);
      if(term == null)
        break Fail381;
      lifted9 lifted90 = new lifted9();
      lifted90.s_23 = s_23;
      lifted90.t_23 = t_23;
      term = try_1_0.instance.invoke(context, term, lifted90);
      if(term == null)
        break Fail381;
      if(true)
        return term;
    }
    return null;
  }
}