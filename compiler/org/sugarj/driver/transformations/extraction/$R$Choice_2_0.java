package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_344, Strategy e_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail919:
    { 
      IStrategoTerm u_450 = null;
      IStrategoTerm s_450 = null;
      IStrategoTerm t_450 = null;
      IStrategoTerm v_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail919;
      s_450 = term.getSubterm(0);
      t_450 = term.getSubterm(1);
      IStrategoList annos164 = term.getAnnotations();
      u_450 = annos164;
      term = d_344.invoke(context, s_450);
      if(term == null)
        break Fail919;
      v_450 = term;
      term = e_344.invoke(context, t_450);
      if(term == null)
        break Fail919;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRChoice_2, new IStrategoTerm[]{v_450, term}), checkListAnnos(termFactory, u_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}