package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail325:
    { 
      IStrategoTerm v_189 = null;
      IStrategoTerm u_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail325;
      u_189 = term.getSubterm(0);
      IStrategoList annos271 = term.getAnnotations();
      v_189 = annos271;
      term = a_46.invoke(context, u_189);
      if(term == null)
        break Fail325;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}