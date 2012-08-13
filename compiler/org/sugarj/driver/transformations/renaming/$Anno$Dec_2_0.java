package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec_2_0 extends Strategy 
{ 
  public static $Anno$Dec_2_0 instance = new $Anno$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_22, Strategy e_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDec_2_0");
    Fail92:
    { 
      IStrategoTerm u_117 = null;
      IStrategoTerm s_117 = null;
      IStrategoTerm t_117 = null;
      IStrategoTerm v_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      s_117 = term.getSubterm(0);
      t_117 = term.getSubterm(1);
      IStrategoList annos73 = term.getAnnotations();
      u_117 = annos73;
      term = d_22.invoke(context, s_117);
      if(term == null)
        break Fail92;
      v_117 = term;
      term = e_22.invoke(context, t_117);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDec_2, new IStrategoTerm[]{v_117, term}), checkListAnnos(termFactory, u_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}