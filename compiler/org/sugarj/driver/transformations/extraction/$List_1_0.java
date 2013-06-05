package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List_1_0 extends Strategy 
{ 
  public static $List_1_0 instance = new $List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("List_1_0");
    Fail162:
    { 
      IStrategoTerm l_127 = null;
      IStrategoTerm k_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      k_127 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      l_127 = annos131;
      term = o_24.invoke(context, k_127);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}