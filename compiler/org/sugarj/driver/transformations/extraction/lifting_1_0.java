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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lifting_1_0");
    Fail1037:
    { 
      IStrategoTerm z_466 = null;
      IStrategoTerm y_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslifting_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1037;
      y_466 = term.getSubterm(0);
      IStrategoList annos264 = term.getAnnotations();
      z_466 = annos264;
      term = i_350.invoke(context, y_466);
      if(term == null)
        break Fail1037;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslifting_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}