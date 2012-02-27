package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Ref_2_0 extends Strategy 
{ 
  public static $Cast$Ref_2_0 instance = new $Cast$Ref_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_24, Strategy i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastRef_2_0");
    Fail138:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm o_125 = null;
      IStrategoTerm p_125 = null;
      IStrategoTerm r_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      o_125 = term.getSubterm(0);
      p_125 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      q_125 = annos118;
      term = h_24.invoke(context, o_125);
      if(term == null)
        break Fail138;
      r_125 = term;
      term = i_24.invoke(context, p_125);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastRef_2, new IStrategoTerm[]{r_125, term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}