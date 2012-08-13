package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class syntax_1_0 extends Strategy 
{ 
  public static syntax_1_0 instance = new syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("syntax_1_0");
    Fail44:
    { 
      IStrategoTerm q_108 = null;
      IStrategoTerm p_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conssyntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      p_108 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      q_108 = annos26;
      term = w_18.invoke(context, p_108);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conssyntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}