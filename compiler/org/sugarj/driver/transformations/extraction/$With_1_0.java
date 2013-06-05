package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With_1_0 extends Strategy 
{ 
  public static $With_1_0 instance = new $With_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail115:
    { 
      IStrategoTerm d_119 = null;
      IStrategoTerm c_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      c_119 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      d_119 = annos87;
      term = w_21.invoke(context, c_119);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}