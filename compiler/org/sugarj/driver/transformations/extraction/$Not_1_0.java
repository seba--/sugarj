package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail897:
    { 
      IStrategoTerm u_447 = null;
      IStrategoTerm t_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail897;
      t_447 = term.getSubterm(0);
      IStrategoList annos143 = term.getAnnotations();
      u_447 = annos143;
      term = b_343.invoke(context, t_447);
      if(term == null)
        break Fail897;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}