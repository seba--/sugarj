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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_23, Strategy a_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastRef_2_0");
    Fail136:
    { 
      IStrategoTerm i_125 = null;
      IStrategoTerm f_125 = null;
      IStrategoTerm h_125 = null;
      IStrategoTerm j_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      f_125 = term.getSubterm(0);
      h_125 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      i_125 = annos118;
      term = z_23.invoke(context, f_125);
      if(term == null)
        break Fail136;
      j_125 = term;
      term = a_24.invoke(context, h_125);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastRef_2, new IStrategoTerm[]{j_125, term}), checkListAnnos(termFactory, i_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}