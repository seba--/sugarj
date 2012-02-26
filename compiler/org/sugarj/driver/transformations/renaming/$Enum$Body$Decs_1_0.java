package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Body$Decs_1_0 extends Strategy 
{ 
  public static $Enum$Body$Decs_1_0 instance = new $Enum$Body$Decs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBodyDecs_1_0");
    Fail48:
    { 
      IStrategoTerm x_106 = null;
      IStrategoTerm v_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumBodyDecs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      v_106 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      x_106 = annos36;
      term = k_17.invoke(context, v_106);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumBodyDecs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}