package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With_1_0 extends Strategy 
{ 
  public static $With_1_0 instance = new $With_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail899:
    { 
      IStrategoTerm a_448 = null;
      IStrategoTerm z_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail899;
      z_447 = term.getSubterm(0);
      IStrategoList annos145 = term.getAnnotations();
      a_448 = annos145;
      term = d_343.invoke(context, z_447);
      if(term == null)
        break Fail899;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}