package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Test_1_0 extends Strategy 
{ 
  public static $Test_1_0 instance = new $Test_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail900:
    { 
      IStrategoTerm d_448 = null;
      IStrategoTerm c_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail900;
      c_448 = term.getSubterm(0);
      IStrategoList annos146 = term.getAnnotations();
      d_448 = annos146;
      term = e_343.invoke(context, c_448);
      if(term == null)
        break Fail900;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}