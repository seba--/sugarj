package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_1_0");
    Fail257:
    { 
      IStrategoTerm a_148 = null;
      IStrategoTerm z_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslexical_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail257;
      z_147 = term.getSubterm(0);
      IStrategoList annos212 = term.getAnnotations();
      a_148 = annos212;
      term = i_29.invoke(context, z_147);
      if(term == null)
        break Fail257;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslexical_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}