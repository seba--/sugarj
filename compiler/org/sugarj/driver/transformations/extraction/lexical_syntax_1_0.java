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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_1_0");
    Fail740:
    { 
      IStrategoTerm f_425 = null;
      IStrategoTerm e_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslexical_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail740;
      e_425 = term.getSubterm(0);
      IStrategoList annos12 = term.getAnnotations();
      f_425 = annos12;
      term = d_334.invoke(context, e_425);
      if(term == null)
        break Fail740;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslexical_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}