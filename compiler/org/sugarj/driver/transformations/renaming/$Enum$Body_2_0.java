package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Body_2_0 extends Strategy 
{ 
  public static $Enum$Body_2_0 instance = new $Enum$Body_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_17, Strategy p_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBody_2_0");
    Fail50:
    { 
      IStrategoTerm k_107 = null;
      IStrategoTerm h_107 = null;
      IStrategoTerm j_107 = null;
      IStrategoTerm o_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      h_107 = term.getSubterm(0);
      j_107 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      k_107 = annos38;
      term = o_17.invoke(context, h_107);
      if(term == null)
        break Fail50;
      o_107 = term;
      term = p_17.invoke(context, j_107);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumBody_2, new IStrategoTerm[]{o_107, term}), checkListAnnos(termFactory, k_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}