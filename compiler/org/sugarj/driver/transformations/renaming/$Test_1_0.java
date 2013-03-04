package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail324:
    { 
      IStrategoTerm s_189 = null;
      IStrategoTerm r_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail324;
      r_189 = term.getSubterm(0);
      IStrategoList annos270 = term.getAnnotations();
      s_189 = annos270;
      term = z_45.invoke(context, r_189);
      if(term == null)
        break Fail324;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}