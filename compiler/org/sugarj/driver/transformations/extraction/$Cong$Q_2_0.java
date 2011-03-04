package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cong$Q_2_0 extends Strategy 
{ 
  public static $Cong$Q_2_0 instance = new $Cong$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_21, Strategy o_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail96:
    { 
      IStrategoTerm z_117 = null;
      IStrategoTerm x_117 = null;
      IStrategoTerm y_117 = null;
      IStrategoTerm a_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      x_117 = term.getSubterm(0);
      y_117 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      z_117 = annos71;
      term = n_21.invoke(context, x_117);
      if(term == null)
        break Fail96;
      a_118 = term;
      term = o_21.invoke(context, y_117);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCongQ_2, new IStrategoTerm[]{a_118, term}), checkListAnnos(termFactory, z_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}