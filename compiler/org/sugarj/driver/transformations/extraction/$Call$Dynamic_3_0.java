package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_346, Strategy x_346, Strategy y_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail967:
    { 
      IStrategoTerm a_458 = null;
      IStrategoTerm x_457 = null;
      IStrategoTerm y_457 = null;
      IStrategoTerm z_457 = null;
      IStrategoTerm b_458 = null;
      IStrategoTerm c_458 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail967;
      x_457 = term.getSubterm(0);
      y_457 = term.getSubterm(1);
      z_457 = term.getSubterm(2);
      IStrategoList annos209 = term.getAnnotations();
      a_458 = annos209;
      term = w_346.invoke(context, x_457);
      if(term == null)
        break Fail967;
      b_458 = term;
      term = x_346.invoke(context, y_457);
      if(term == null)
        break Fail967;
      c_458 = term;
      term = y_346.invoke(context, z_457);
      if(term == null)
        break Fail967;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCallDynamic_3, new IStrategoTerm[]{b_458, c_458, term}), checkListAnnos(termFactory, a_458));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}