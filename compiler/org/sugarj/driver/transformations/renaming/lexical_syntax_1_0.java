package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_syntax_1_0 extends Strategy 
{ 
  public static lexical_syntax_1_0 instance = new lexical_syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_1_0");
    Fail43:
    { 
      IStrategoTerm n_108 = null;
      IStrategoTerm m_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conslexical_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      m_108 = term.getSubterm(0);
      IStrategoList annos25 = term.getAnnotations();
      n_108 = annos25;
      term = v_18.invoke(context, m_108);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conslexical_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}