package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_23, Strategy j_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail139:
    { 
      IStrategoTerm q_123 = null;
      IStrategoTerm o_123 = null;
      IStrategoTerm p_123 = null;
      IStrategoTerm r_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      o_123 = term.getSubterm(0);
      p_123 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      q_123 = annos109;
      term = i_23.invoke(context, o_123);
      if(term == null)
        break Fail139;
      r_123 = term;
      term = j_23.invoke(context, p_123);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consFunType_2, new IStrategoTerm[]{r_123, term}), checkListAnnos(termFactory, q_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}