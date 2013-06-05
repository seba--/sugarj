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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_21, Strategy j_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail104:
    { 
      IStrategoTerm s_117 = null;
      IStrategoTerm q_117 = null;
      IStrategoTerm r_117 = null;
      IStrategoTerm t_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      q_117 = term.getSubterm(0);
      r_117 = term.getSubterm(1);
      IStrategoList annos77 = term.getAnnotations();
      s_117 = annos77;
      term = i_21.invoke(context, q_117);
      if(term == null)
        break Fail104;
      t_117 = term;
      term = j_21.invoke(context, r_117);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consTupleCong_2, new IStrategoTerm[]{t_117, term}), checkListAnnos(termFactory, s_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}