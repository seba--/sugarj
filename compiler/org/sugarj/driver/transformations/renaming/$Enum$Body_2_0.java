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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_16, Strategy a_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBody_2_0");
    Fail47:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm p_106 = null;
      IStrategoTerm q_106 = null;
      IStrategoTerm s_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      p_106 = term.getSubterm(0);
      q_106 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      r_106 = annos38;
      term = z_16.invoke(context, p_106);
      if(term == null)
        break Fail47;
      s_106 = term;
      term = a_17.invoke(context, q_106);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumBody_2, new IStrategoTerm[]{s_106, term}), checkListAnnos(termFactory, r_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}