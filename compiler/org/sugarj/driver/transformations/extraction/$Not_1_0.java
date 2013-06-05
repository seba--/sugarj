package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail117:
    { 
      IStrategoTerm j_119 = null;
      IStrategoTerm i_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      i_119 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      j_119 = annos89;
      term = y_21.invoke(context, i_119);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}