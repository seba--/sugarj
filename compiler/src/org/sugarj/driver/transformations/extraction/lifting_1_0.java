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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lifting_1_0");
    Fail230:
    { 
      IStrategoTerm d_141 = null;
      IStrategoTerm z_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslifting_1 != ((IStrategoAppl)term).getConstructor())
        break Fail230;
      z_140 = term.getSubterm(0);
      IStrategoList annos188 = term.getAnnotations();
      d_141 = annos188;
      term = s_27.invoke(context, z_140);
      if(term == null)
        break Fail230;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslifting_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}