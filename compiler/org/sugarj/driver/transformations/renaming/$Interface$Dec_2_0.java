package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec_2_0 extends Strategy 
{ 
  public static $Interface$Dec_2_0 instance = new $Interface$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_15, Strategy v_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDec_2_0");
    Fail37:
    { 
      IStrategoTerm s_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      IStrategoTerm t_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      q_103 = term.getSubterm(0);
      r_103 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      s_103 = annos28;
      term = u_15.invoke(context, q_103);
      if(term == null)
        break Fail37;
      t_103 = term;
      term = v_15.invoke(context, r_103);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDec_2, new IStrategoTerm[]{t_103, term}), checkListAnnos(termFactory, s_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}