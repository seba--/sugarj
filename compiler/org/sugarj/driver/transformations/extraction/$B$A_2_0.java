package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_22, Strategy f_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail108:
    { 
      IStrategoTerm w_119 = null;
      IStrategoTerm t_119 = null;
      IStrategoTerm u_119 = null;
      IStrategoTerm x_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      t_119 = term.getSubterm(0);
      u_119 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      w_119 = annos84;
      term = e_22.invoke(context, t_119);
      if(term == null)
        break Fail108;
      x_119 = term;
      term = f_22.invoke(context, u_119);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consBA_2, new IStrategoTerm[]{x_119, term}), checkListAnnos(termFactory, w_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}