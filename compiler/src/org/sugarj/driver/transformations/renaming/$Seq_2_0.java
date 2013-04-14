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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16, Strategy n_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail102:
    { 
      IStrategoTerm f_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm e_108 = null;
      IStrategoTerm g_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      d_108 = term.getSubterm(0);
      e_108 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      f_108 = annos92;
      term = m_16.invoke(context, d_108);
      if(term == null)
        break Fail102;
      g_108 = term;
      term = n_16.invoke(context, e_108);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSeq_2, new IStrategoTerm[]{g_108, term}), checkListAnnos(termFactory, f_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}