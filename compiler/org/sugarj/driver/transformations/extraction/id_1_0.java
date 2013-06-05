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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("id_1_0");
    Fail251:
    { 
      IStrategoTerm v_144 = null;
      IStrategoTerm u_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consid_1 != ((IStrategoAppl)term).getConstructor())
        break Fail251;
      u_144 = term.getSubterm(0);
      IStrategoList annos203 = term.getAnnotations();
      v_144 = annos203;
      term = q_28.invoke(context, u_144);
      if(term == null)
        break Fail251;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consid_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}