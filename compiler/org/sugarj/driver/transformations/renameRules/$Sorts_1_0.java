package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail124:
    { 
      IStrategoTerm d_112 = null;
      IStrategoTerm c_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      c_112 = term.getSubterm(0);
      IStrategoList annos115 = term.getAnnotations();
      d_112 = annos115;
      term = s_17.invoke(context, c_112);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}