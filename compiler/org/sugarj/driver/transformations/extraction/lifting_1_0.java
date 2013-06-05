package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lifting_1_0 extends Strategy 
{ 
  public static lifting_1_0 instance = new lifting_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lifting_1_0");
    Fail229:
    { 
      IStrategoTerm v_140 = null;
      IStrategoTerm u_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslifting_1 != ((IStrategoAppl)term).getConstructor())
        break Fail229;
      u_140 = term.getSubterm(0);
      IStrategoList annos187 = term.getAnnotations();
      v_140 = annos187;
      term = q_27.invoke(context, u_140);
      if(term == null)
        break Fail229;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslifting_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}