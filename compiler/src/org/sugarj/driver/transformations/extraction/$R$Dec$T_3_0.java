package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$T_3_0 extends Strategy 
{ 
  public static $R$Dec$T_3_0 instance = new $R$Dec$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_16, Strategy i_16, Strategy j_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail37:
    { 
      IStrategoTerm x_103 = null;
      IStrategoTerm u_103 = null;
      IStrategoTerm v_103 = null;
      IStrategoTerm w_103 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm b_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      u_103 = term.getSubterm(0);
      v_103 = term.getSubterm(1);
      w_103 = term.getSubterm(2);
      IStrategoList annos10 = term.getAnnotations();
      x_103 = annos10;
      term = h_16.invoke(context, u_103);
      if(term == null)
        break Fail37;
      z_103 = term;
      term = i_16.invoke(context, v_103);
      if(term == null)
        break Fail37;
      b_104 = term;
      term = j_16.invoke(context, w_103);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDecT_3, new IStrategoTerm[]{z_103, b_104, term}), checkListAnnos(termFactory, x_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}