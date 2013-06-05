package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_21, Strategy a_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail118:
    { 
      IStrategoTerm n_119 = null;
      IStrategoTerm l_119 = null;
      IStrategoTerm m_119 = null;
      IStrategoTerm o_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      l_119 = term.getSubterm(0);
      m_119 = term.getSubterm(1);
      IStrategoList annos90 = term.getAnnotations();
      n_119 = annos90;
      term = z_21.invoke(context, l_119);
      if(term == null)
        break Fail118;
      o_119 = term;
      term = a_22.invoke(context, m_119);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRec_2, new IStrategoTerm[]{o_119, term}), checkListAnnos(termFactory, n_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}