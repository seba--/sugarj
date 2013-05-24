package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Attribute_1_0 extends Strategy 
{ 
  public static $Attribute_1_0 instance = new $Attribute_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Attribute_1_0");
    Fail819:
    { 
      IStrategoTerm s_434 = null;
      IStrategoTerm r_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAttribute_1 != ((IStrategoAppl)term).getConstructor())
        break Fail819;
      r_434 = term.getSubterm(0);
      IStrategoList annos67 = term.getAnnotations();
      s_434 = annos67;
      term = v_337.invoke(context, r_434);
      if(term == null)
        break Fail819;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAttribute_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_434));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}