package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail224:
    { 
      IStrategoTerm b_173 = null;
      IStrategoTerm a_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail224;
      a_173 = term.getSubterm(0);
      IStrategoList annos184 = term.getAnnotations();
      b_173 = annos184;
      term = c_40.invoke(context, a_173);
      if(term == null)
        break Fail224;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}