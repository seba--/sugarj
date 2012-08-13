package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch_2_0 extends Strategy 
{ 
  public static $Switch_2_0 instance = new $Switch_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_25, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Switch_2_0");
    Fail134:
    { 
      IStrategoTerm b_128 = null;
      IStrategoTerm z_127 = null;
      IStrategoTerm a_128 = null;
      IStrategoTerm c_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      z_127 = term.getSubterm(0);
      a_128 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      b_128 = annos112;
      term = x_25.invoke(context, z_127);
      if(term == null)
        break Fail134;
      c_128 = term;
      term = y_25.invoke(context, a_128);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitch_2, new IStrategoTerm[]{c_128, term}), checkListAnnos(termFactory, b_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}