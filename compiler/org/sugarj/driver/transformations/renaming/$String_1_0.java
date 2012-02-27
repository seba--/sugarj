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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail188:
    { 
      IStrategoTerm b_135 = null;
      IStrategoTerm z_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      z_134 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      b_135 = annos158;
      term = r_26.invoke(context, z_134);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}