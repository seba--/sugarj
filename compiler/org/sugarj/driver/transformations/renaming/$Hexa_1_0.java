package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Hexa_1_0 extends Strategy 
{ 
  public static $Hexa_1_0 instance = new $Hexa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Hexa_1_0");
    Fail242:
    { 
      IStrategoTerm v_151 = null;
      IStrategoTerm u_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consHexa_1 != ((IStrategoAppl)term).getConstructor())
        break Fail242;
      u_151 = term.getSubterm(0);
      IStrategoList annos205 = term.getAnnotations();
      v_151 = annos205;
      term = a_32.invoke(context, u_151);
      if(term == null)
        break Fail242;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consHexa_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}