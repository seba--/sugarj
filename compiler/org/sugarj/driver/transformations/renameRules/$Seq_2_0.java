package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail99:
    { 
      IStrategoTerm a_108 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm z_107 = null;
      IStrategoTerm b_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      y_107 = term.getSubterm(0);
      z_107 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      a_108 = annos92;
      term = h_16.invoke(context, y_107);
      if(term == null)
        break Fail99;
      b_108 = term;
      term = i_16.invoke(context, z_107);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSeq_2, new IStrategoTerm[]{b_108, term}), checkListAnnos(termFactory, a_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}