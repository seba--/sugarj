package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class char_class_1_0 extends Strategy 
{ 
  public static char_class_1_0 instance = new char_class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("char_class_1_0");
    Fail987:
    { 
      IStrategoTerm k_461 = null;
      IStrategoTerm j_461 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conschar_class_1 != ((IStrategoAppl)term).getConstructor())
        break Fail987;
      j_461 = term.getSubterm(0);
      IStrategoList annos227 = term.getAnnotations();
      k_461 = annos227;
      term = g_348.invoke(context, j_461);
      if(term == null)
        break Fail987;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conschar_class_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_461));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}