package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_2_0 extends Strategy 
{ 
  public static $Try_2_0 instance = new $Try_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_19, Strategy f_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_2_0");
    Fail73:
    { 
      IStrategoTerm q_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm p_112 = null;
      IStrategoTerm r_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      o_112 = term.getSubterm(0);
      p_112 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      q_112 = annos61;
      term = e_19.invoke(context, o_112);
      if(term == null)
        break Fail73;
      r_112 = term;
      term = f_19.invoke(context, p_112);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_2, new IStrategoTerm[]{r_112, term}), checkListAnnos(termFactory, q_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}