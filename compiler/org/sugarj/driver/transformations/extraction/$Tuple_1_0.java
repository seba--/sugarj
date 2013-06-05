package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple_1_0 extends Strategy 
{ 
  public static $Tuple_1_0 instance = new $Tuple_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Tuple_1_0");
    Fail163:
    { 
      IStrategoTerm o_127 = null;
      IStrategoTerm n_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      n_127 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      o_127 = annos132;
      term = p_24.invoke(context, n_127);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}