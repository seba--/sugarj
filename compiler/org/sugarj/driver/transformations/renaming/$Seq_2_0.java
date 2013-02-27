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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_16, Strategy h_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail103:
    { 
      IStrategoTerm z_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm a_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      x_107 = term.getSubterm(0);
      y_107 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      z_107 = annos92;
      term = g_16.invoke(context, x_107);
      if(term == null)
        break Fail103;
      a_108 = term;
      term = h_16.invoke(context, y_107);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSeq_2, new IStrategoTerm[]{a_108, term}), checkListAnnos(termFactory, z_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}