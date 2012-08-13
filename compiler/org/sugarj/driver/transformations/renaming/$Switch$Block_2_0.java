package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Block_2_0 extends Strategy 
{ 
  public static $Switch$Block_2_0 instance = new $Switch$Block_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_24, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchBlock_2_0");
    Fail122:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm o_125 = null;
      IStrategoTerm p_125 = null;
      IStrategoTerm r_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchBlock_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      o_125 = term.getSubterm(0);
      p_125 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      q_125 = annos100;
      term = z_24.invoke(context, o_125);
      if(term == null)
        break Fail122;
      r_125 = term;
      term = a_25.invoke(context, p_125);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchBlock_2, new IStrategoTerm[]{r_125, term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}