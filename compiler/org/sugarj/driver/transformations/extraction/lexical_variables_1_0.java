package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_variables_1_0 extends Strategy 
{ 
  public static lexical_variables_1_0 instance = new lexical_variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_variables_1_0");
    Fail265:
    { 
      IStrategoTerm n_147 = null;
      IStrategoTerm m_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslexical_variables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail265;
      m_147 = term.getSubterm(0);
      IStrategoList annos217 = term.getAnnotations();
      n_147 = annos217;
      term = e_29.invoke(context, m_147);
      if(term == null)
        break Fail265;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslexical_variables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}