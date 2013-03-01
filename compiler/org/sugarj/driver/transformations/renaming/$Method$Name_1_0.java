package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Name_1_0 extends Strategy 
{ 
  public static $Method$Name_1_0 instance = new $Method$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_1_0");
    Fail206:
    { 
      IStrategoTerm k_171 = null;
      IStrategoTerm j_171 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      j_171 = term.getSubterm(0);
      IStrategoList annos175 = term.getAnnotations();
      k_171 = annos175;
      term = q_39.invoke(context, j_171);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethodName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_171));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}