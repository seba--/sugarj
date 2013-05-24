package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_priorities_1_0 extends Strategy 
{ 
  public static lexical_priorities_1_0 instance = new lexical_priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_priorities_1_0");
    Fail745:
    { 
      IStrategoTerm u_425 = null;
      IStrategoTerm t_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslexical_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail745;
      t_425 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      u_425 = annos17;
      term = i_334.invoke(context, t_425);
      if(term == null)
        break Fail745;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslexical_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}