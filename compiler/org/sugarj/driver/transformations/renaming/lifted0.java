package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference s_14;

  TermReference t_14;

  TermReference u_14;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail258:
    { 
      lifted1 lifted10 = new lifted1();
      lifted10.s_14 = s_14;
      lifted10.t_14 = t_14;
      lifted10.u_14 = u_14;
      term = try_1_0.instance.invoke(context, term, lifted10);
      if(term == null)
        break Fail258;
      lifted2 lifted20 = new lifted2();
      lifted20.t_14 = t_14;
      lifted20.u_14 = u_14;
      term = try_1_0.instance.invoke(context, term, lifted20);
      if(term == null)
        break Fail258;
      lifted3 lifted30 = new lifted3();
      lifted30.t_14 = t_14;
      lifted30.u_14 = u_14;
      term = try_1_0.instance.invoke(context, term, lifted30);
      if(term == null)
        break Fail258;
      lifted4 lifted40 = new lifted4();
      lifted40.t_14 = t_14;
      lifted40.u_14 = u_14;
      term = try_1_0.instance.invoke(context, term, lifted40);
      if(term == null)
        break Fail258;
      if(true)
        return term;
    }
    return null;
  }
}