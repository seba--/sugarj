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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_22, Strategy a_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBody_2_0");
    Fail98:
    { 
      IStrategoTerm t_119 = null;
      IStrategoTerm q_119 = null;
      IStrategoTerm r_119 = null;
      IStrategoTerm u_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      q_119 = term.getSubterm(0);
      r_119 = term.getSubterm(1);
      IStrategoList annos79 = term.getAnnotations();
      t_119 = annos79;
      term = z_22.invoke(context, q_119);
      if(term == null)
        break Fail98;
      u_119 = term;
      term = a_23.invoke(context, r_119);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumBody_2, new IStrategoTerm[]{u_119, term}), checkListAnnos(termFactory, t_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}