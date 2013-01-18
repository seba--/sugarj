package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Deci_1_0 extends Strategy 
{ 
  public static $Deci_1_0 instance = new $Deci_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Deci_1_0");
    Fail233:
    { 
      IStrategoTerm c_174 = null;
      IStrategoTerm b_174 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDeci_1 != ((IStrategoAppl)term).getConstructor())
        break Fail233;
      b_174 = term.getSubterm(0);
      IStrategoList annos191 = term.getAnnotations();
      c_174 = annos191;
      term = j_40.invoke(context, b_174);
      if(term == null)
        break Fail233;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDeci_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_174));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}