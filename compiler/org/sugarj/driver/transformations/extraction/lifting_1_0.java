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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lifting_1_0");
    Fail218:
    { 
      IStrategoTerm s_140 = null;
      IStrategoTerm o_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslifting_1 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      o_140 = term.getSubterm(0);
      IStrategoList annos179 = term.getAnnotations();
      s_140 = annos179;
      term = r_27.invoke(context, o_140);
      if(term == null)
        break Fail218;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslifting_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}