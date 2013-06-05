package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail98:
    { 
      IStrategoTerm v_116 = null;
      IStrategoTerm u_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      u_116 = term.getSubterm(0);
      IStrategoList annos71 = term.getAnnotations();
      v_116 = annos71;
      term = a_21.invoke(context, u_116);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}