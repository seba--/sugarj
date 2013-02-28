package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Seq_2_0 extends Strategy 
{ 
  public static $Seq_2_0 instance = new $Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_16, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail103:
    { 
      IStrategoTerm c_108 = null;
      IStrategoTerm a_108 = null;
      IStrategoTerm b_108 = null;
      IStrategoTerm d_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      a_108 = term.getSubterm(0);
      b_108 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      c_108 = annos92;
      term = j_16.invoke(context, a_108);
      if(term == null)
        break Fail103;
      d_108 = term;
      term = k_16.invoke(context, b_108);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSeq_2, new IStrategoTerm[]{d_108, term}), checkListAnnos(termFactory, c_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}