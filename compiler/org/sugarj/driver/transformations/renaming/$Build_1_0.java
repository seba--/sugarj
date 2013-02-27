package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build_1_0 extends Strategy 
{ 
  public static $Build_1_0 instance = new $Build_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail105:
    { 
      IStrategoTerm i_108 = null;
      IStrategoTerm h_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      h_108 = term.getSubterm(0);
      IStrategoList annos94 = term.getAnnotations();
      i_108 = annos94;
      term = k_16.invoke(context, h_108);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}