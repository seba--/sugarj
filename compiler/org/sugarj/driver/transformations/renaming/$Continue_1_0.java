package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Continue_1_0 extends Strategy 
{ 
  public static $Continue_1_0 instance = new $Continue_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Continue_1_0");
    Fail118:
    { 
      IStrategoTerm a_150 = null;
      IStrategoTerm z_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consContinue_1 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      z_149 = term.getSubterm(0);
      IStrategoList annos91 = term.getAnnotations();
      a_150 = annos91;
      term = s_33.invoke(context, z_149);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consContinue_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}