package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_48, Strategy b_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail358:
    { 
      IStrategoTerm w_195 = null;
      IStrategoTerm u_195 = null;
      IStrategoTerm v_195 = null;
      IStrategoTerm x_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail358;
      u_195 = term.getSubterm(0);
      v_195 = term.getSubterm(1);
      IStrategoList annos302 = term.getAnnotations();
      w_195 = annos302;
      term = a_48.invoke(context, u_195);
      if(term == null)
        break Fail358;
      x_195 = term;
      term = b_48.invoke(context, v_195);
      if(term == null)
        break Fail358;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSort_2, new IStrategoTerm[]{x_195, term}), checkListAnnos(termFactory, w_195));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}