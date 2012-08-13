package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail118:
    { 
      IStrategoTerm d_125 = null;
      IStrategoTerm c_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      c_125 = term.getSubterm(0);
      IStrategoList annos97 = term.getAnnotations();
      d_125 = annos97;
      term = v_24.invoke(context, c_125);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}