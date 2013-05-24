package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completion$Keyword_2_0 extends Strategy 
{ 
  public static $Completion$Keyword_2_0 instance = new $Completion$Keyword_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_335, Strategy p_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionKeyword_2_0");
    Fail772:
    { 
      IStrategoTerm c_429 = null;
      IStrategoTerm a_429 = null;
      IStrategoTerm b_429 = null;
      IStrategoTerm d_429 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletionKeyword_2 != ((IStrategoAppl)term).getConstructor())
        break Fail772;
      a_429 = term.getSubterm(0);
      b_429 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      c_429 = annos38;
      term = o_335.invoke(context, a_429);
      if(term == null)
        break Fail772;
      d_429 = term;
      term = p_335.invoke(context, b_429);
      if(term == null)
        break Fail772;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletionKeyword_2, new IStrategoTerm[]{d_429, term}), checkListAnnos(termFactory, c_429));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}