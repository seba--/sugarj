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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail115:
    { 
      IStrategoTerm f_119 = null;
      IStrategoTerm e_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      e_119 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      f_119 = annos87;
      term = x_21.invoke(context, e_119);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}