package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unquoted_1_0 extends Strategy 
{ 
  public static unquoted_1_0 instance = new unquoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_1_0");
    Fail996:
    { 
      IStrategoTerm i_462 = null;
      IStrategoTerm h_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consunquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail996;
      h_462 = term.getSubterm(0);
      IStrategoList annos233 = term.getAnnotations();
      i_462 = annos233;
      term = p_348.invoke(context, h_462);
      if(term == null)
        break Fail996;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consunquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}