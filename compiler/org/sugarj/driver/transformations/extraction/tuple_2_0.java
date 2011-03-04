package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class tuple_2_0 extends Strategy 
{ 
  public static tuple_2_0 instance = new tuple_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_27, Strategy x_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("tuple_2_0");
    Fail221:
    { 
      IStrategoTerm w_141 = null;
      IStrategoTerm t_141 = null;
      IStrategoTerm v_141 = null;
      IStrategoTerm i_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._constuple_2 != ((IStrategoAppl)term).getConstructor())
        break Fail221;
      t_141 = term.getSubterm(0);
      v_141 = term.getSubterm(1);
      IStrategoList annos182 = term.getAnnotations();
      w_141 = annos182;
      term = w_27.invoke(context, t_141);
      if(term == null)
        break Fail221;
      i_142 = term;
      term = x_27.invoke(context, v_141);
      if(term == null)
        break Fail221;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._constuple_2, new IStrategoTerm[]{i_142, term}), checkListAnnos(termFactory, w_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}