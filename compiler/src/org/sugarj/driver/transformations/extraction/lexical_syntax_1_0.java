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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_1_0");
    Fail269:
    { 
      IStrategoTerm i_148 = null;
      IStrategoTerm h_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslexical_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail269;
      h_148 = term.getSubterm(0);
      IStrategoList annos221 = term.getAnnotations();
      i_148 = annos221;
      term = j_29.invoke(context, h_148);
      if(term == null)
        break Fail269;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslexical_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}