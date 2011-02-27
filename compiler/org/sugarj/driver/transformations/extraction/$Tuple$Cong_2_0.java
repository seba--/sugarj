package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple$Cong_2_0 extends Strategy 
{ 
  public static $Tuple$Cong_2_0 instance = new $Tuple$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_21, Strategy k_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail92:
    { 
      IStrategoTerm p_117 = null;
      IStrategoTerm n_117 = null;
      IStrategoTerm o_117 = null;
      IStrategoTerm q_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      n_117 = term.getSubterm(0);
      o_117 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      p_117 = annos69;
      term = j_21.invoke(context, n_117);
      if(term == null)
        break Fail92;
      q_117 = term;
      term = k_21.invoke(context, o_117);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consTupleCong_2, new IStrategoTerm[]{q_117, term}), checkListAnnos(termFactory, p_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}