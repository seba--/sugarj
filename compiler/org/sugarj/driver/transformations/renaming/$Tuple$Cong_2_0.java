package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_45, Strategy n_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail314:
    { 
      IStrategoTerm j_188 = null;
      IStrategoTerm h_188 = null;
      IStrategoTerm i_188 = null;
      IStrategoTerm k_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail314;
      h_188 = term.getSubterm(0);
      i_188 = term.getSubterm(1);
      IStrategoList annos261 = term.getAnnotations();
      j_188 = annos261;
      term = m_45.invoke(context, h_188);
      if(term == null)
        break Fail314;
      k_188 = term;
      term = n_45.invoke(context, i_188);
      if(term == null)
        break Fail314;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTupleCong_2, new IStrategoTerm[]{k_188, term}), checkListAnnos(termFactory, j_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}