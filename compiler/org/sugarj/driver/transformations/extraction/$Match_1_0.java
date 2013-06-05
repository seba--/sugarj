package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail131:
    { 
      IStrategoTerm j_122 = null;
      IStrategoTerm i_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      i_122 = term.getSubterm(0);
      IStrategoList annos103 = term.getAnnotations();
      j_122 = annos103;
      term = w_22.invoke(context, i_122);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}