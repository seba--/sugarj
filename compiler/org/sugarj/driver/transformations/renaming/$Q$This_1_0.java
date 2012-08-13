package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$This_1_0 extends Strategy 
{ 
  public static $Q$This_1_0 instance = new $Q$This_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QThis_1_0");
    Fail197:
    { 
      IStrategoTerm i_146 = null;
      IStrategoTerm h_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQThis_1 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      h_146 = term.getSubterm(0);
      IStrategoList annos172 = term.getAnnotations();
      i_146 = annos172;
      term = i_30.invoke(context, h_146);
      if(term == null)
        break Fail197;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQThis_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}