package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail125:
    { 
      IStrategoTerm c_121 = null;
      IStrategoTerm b_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      b_121 = term.getSubterm(0);
      IStrategoList annos97 = term.getAnnotations();
      c_121 = annos97;
      term = l_22.invoke(context, b_121);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}