package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Body_1_0 extends Strategy 
{ 
  public static $Sugar$Body_1_0 instance = new $Sugar$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarBody_1_0");
    Fail19:
    { 
      IStrategoTerm t_104 = null;
      IStrategoTerm s_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSugarBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      s_104 = term.getSubterm(0);
      IStrategoList annos1 = term.getAnnotations();
      t_104 = annos1;
      term = o_17.invoke(context, s_104);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSugarBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}