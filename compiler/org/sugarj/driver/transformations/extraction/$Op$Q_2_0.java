package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Q_2_0 extends Strategy 
{ 
  public static $Op$Q_2_0 instance = new $Op$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_24, Strategy w_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail156:
    { 
      IStrategoTerm a_128 = null;
      IStrategoTerm y_127 = null;
      IStrategoTerm z_127 = null;
      IStrategoTerm b_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      y_127 = term.getSubterm(0);
      z_127 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      a_128 = annos128;
      term = v_24.invoke(context, y_127);
      if(term == null)
        break Fail156;
      b_128 = term;
      term = w_24.invoke(context, z_127);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOpQ_2, new IStrategoTerm[]{b_128, term}), checkListAnnos(termFactory, a_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}