package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class_1_0 extends Strategy 
{ 
  public static $Class_1_0 instance = new $Class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Class_1_0");
    Fail105:
    { 
      IStrategoTerm f_118 = null;
      IStrategoTerm e_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      e_118 = term.getSubterm(0);
      IStrategoList annos85 = term.getAnnotations();
      f_118 = annos85;
      term = u_21.invoke(context, e_118);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}