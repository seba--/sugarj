package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $One_1_0 extends Strategy 
{ 
  public static $One_1_0 instance = new $One_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail99:
    { 
      IStrategoTerm k_107 = null;
      IStrategoTerm j_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      j_107 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      k_107 = annos89;
      term = f_16.invoke(context, j_107);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}