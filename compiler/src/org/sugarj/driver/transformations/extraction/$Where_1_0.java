package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Where_1_0 extends Strategy 
{ 
  public static $Where_1_0 instance = new $Where_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail117:
    { 
      IStrategoTerm l_119 = null;
      IStrategoTerm k_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      k_119 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      l_119 = annos89;
      term = z_21.invoke(context, k_119);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}