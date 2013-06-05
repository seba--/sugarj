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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail114:
    { 
      IStrategoTerm a_119 = null;
      IStrategoTerm z_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      z_118 = term.getSubterm(0);
      IStrategoList annos86 = term.getAnnotations();
      a_119 = annos86;
      term = v_21.invoke(context, z_118);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}