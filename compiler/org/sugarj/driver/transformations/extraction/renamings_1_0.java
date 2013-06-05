package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamings_1_0 extends Strategy 
{ 
  public static renamings_1_0 instance = new renamings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamings_1_0");
    Fail221:
    { 
      IStrategoTerm b_139 = null;
      IStrategoTerm a_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consrenamings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail221;
      a_139 = term.getSubterm(0);
      IStrategoList annos181 = term.getAnnotations();
      b_139 = annos181;
      term = i_27.invoke(context, a_139);
      if(term == null)
        break Fail221;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consrenamings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}