package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Extends$Interfaces_1_0 extends Strategy 
{ 
  public static $Extends$Interfaces_1_0 instance = new $Extends$Interfaces_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtendsInterfaces_1_0");
    Fail86:
    { 
      IStrategoTerm l_116 = null;
      IStrategoTerm k_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExtendsInterfaces_1 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      k_116 = term.getSubterm(0);
      IStrategoList annos67 = term.getAnnotations();
      l_116 = annos67;
      term = p_21.invoke(context, k_116);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExtendsInterfaces_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}