package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class varsym_1_0 extends Strategy 
{ 
  public static varsym_1_0 instance = new varsym_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("varsym_1_0");
    Fail239:
    { 
      IStrategoTerm k_143 = null;
      IStrategoTerm i_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consvarsym_1 != ((IStrategoAppl)term).getConstructor())
        break Fail239;
      i_143 = term.getSubterm(0);
      IStrategoList annos196 = term.getAnnotations();
      k_143 = annos196;
      term = e_28.invoke(context, i_143);
      if(term == null)
        break Fail239;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consvarsym_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}