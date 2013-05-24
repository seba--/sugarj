package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_restrictions_1_0 extends Strategy 
{ 
  public static lexical_restrictions_1_0 instance = new lexical_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_restrictions_1_0");
    Fail748:
    { 
      IStrategoTerm d_426 = null;
      IStrategoTerm c_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslexical_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail748;
      c_426 = term.getSubterm(0);
      IStrategoList annos20 = term.getAnnotations();
      d_426 = annos20;
      term = l_334.invoke(context, c_426);
      if(term == null)
        break Fail748;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslexical_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}