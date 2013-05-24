package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completion$Proposer_1_0 extends Strategy 
{ 
  public static $Completion$Proposer_1_0 instance = new $Completion$Proposer_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionProposer_1_0");
    Fail770:
    { 
      IStrategoTerm v_428 = null;
      IStrategoTerm u_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletionProposer_1 != ((IStrategoAppl)term).getConstructor())
        break Fail770;
      u_428 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      v_428 = annos36;
      term = m_335.invoke(context, u_428);
      if(term == null)
        break Fail770;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletionProposer_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}