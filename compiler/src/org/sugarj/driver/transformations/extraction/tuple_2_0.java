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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_27, Strategy y_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("tuple_2_0");
    Fail233:
    { 
      IStrategoTerm q_142 = null;
      IStrategoTerm o_142 = null;
      IStrategoTerm p_142 = null;
      IStrategoTerm r_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._constuple_2 != ((IStrategoAppl)term).getConstructor())
        break Fail233;
      o_142 = term.getSubterm(0);
      p_142 = term.getSubterm(1);
      IStrategoList annos191 = term.getAnnotations();
      q_142 = annos191;
      term = x_27.invoke(context, o_142);
      if(term == null)
        break Fail233;
      r_142 = term;
      term = y_27.invoke(context, p_142);
      if(term == null)
        break Fail233;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._constuple_2, new IStrategoTerm[]{r_142, term}), checkListAnnos(termFactory, q_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}