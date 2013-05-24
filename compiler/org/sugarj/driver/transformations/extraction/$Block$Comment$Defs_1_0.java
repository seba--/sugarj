package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block$Comment$Defs_1_0 extends Strategy 
{ 
  public static $Block$Comment$Defs_1_0 instance = new $Block$Comment$Defs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BlockCommentDefs_1_0");
    Fail834:
    { 
      IStrategoTerm n_436 = null;
      IStrategoTerm m_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBlockCommentDefs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail834;
      m_436 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      n_436 = annos82;
      term = o_338.invoke(context, m_436);
      if(term == null)
        break Fail834;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBlockCommentDefs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}