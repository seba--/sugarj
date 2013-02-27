package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_12, Strategy i_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail48:
    { 
      IStrategoTerm x_96 = null;
      IStrategoTerm v_96 = null;
      IStrategoTerm w_96 = null;
      IStrategoTerm y_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      v_96 = term.getSubterm(0);
      w_96 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      x_96 = annos38;
      term = h_12.invoke(context, v_96);
      if(term == null)
        break Fail48;
      y_96 = term;
      term = i_12.invoke(context, w_96);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModule_2, new IStrategoTerm[]{y_96, term}), checkListAnnos(termFactory, x_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}