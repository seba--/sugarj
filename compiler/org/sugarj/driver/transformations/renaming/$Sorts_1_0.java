package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail362:
    { 
      IStrategoTerm j_196 = null;
      IStrategoTerm i_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail362;
      i_196 = term.getSubterm(0);
      IStrategoList annos306 = term.getAnnotations();
      j_196 = annos306;
      term = f_48.invoke(context, i_196);
      if(term == null)
        break Fail362;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}