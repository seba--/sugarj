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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("List_1_0");
    Fail163:
    { 
      IStrategoTerm q_127 = null;
      IStrategoTerm p_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      p_127 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      q_127 = annos132;
      term = q_24.invoke(context, p_127);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}