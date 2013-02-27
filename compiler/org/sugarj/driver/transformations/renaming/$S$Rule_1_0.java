package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail73:
    { 
      IStrategoTerm c_103 = null;
      IStrategoTerm b_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      b_103 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      c_103 = annos63;
      term = p_14.invoke(context, b_103);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}