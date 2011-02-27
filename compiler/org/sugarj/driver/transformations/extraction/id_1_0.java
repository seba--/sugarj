package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class id_1_0 extends Strategy 
{ 
  public static id_1_0 instance = new id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("id_1_0");
    Fail239:
    { 
      IStrategoTerm s_144 = null;
      IStrategoTerm r_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consid_1 != ((IStrategoAppl)term).getConstructor())
        break Fail239;
      r_144 = term.getSubterm(0);
      IStrategoList annos195 = term.getAnnotations();
      s_144 = annos195;
      term = r_28.invoke(context, r_144);
      if(term == null)
        break Fail239;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consid_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}