package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Complement_1_0 extends Strategy 
{ 
  public static $Complement_1_0 instance = new $Complement_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Complement_1_0");
    Fail177:
    { 
      IStrategoTerm l_166 = null;
      IStrategoTerm k_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consComplement_1 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      k_166 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      l_166 = annos147;
      term = x_37.invoke(context, k_166);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consComplement_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}