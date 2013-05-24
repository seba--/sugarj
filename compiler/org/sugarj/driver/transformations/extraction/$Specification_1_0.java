package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Specification_1_0 extends Strategy 
{ 
  public static $Specification_1_0 instance = new $Specification_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail984:
    { 
      IStrategoTerm z_460 = null;
      IStrategoTerm y_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail984;
      y_460 = term.getSubterm(0);
      IStrategoList annos224 = term.getAnnotations();
      z_460 = annos224;
      term = c_348.invoke(context, y_460);
      if(term == null)
        break Fail984;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}