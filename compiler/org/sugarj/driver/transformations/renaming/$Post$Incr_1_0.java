package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Incr_1_0 extends Strategy 
{ 
  public static $Post$Incr_1_0 instance = new $Post$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostIncr_1_0");
    Fail183:
    { 
      IStrategoTerm d_167 = null;
      IStrategoTerm c_167 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      c_167 = term.getSubterm(0);
      IStrategoList annos153 = term.getAnnotations();
      d_167 = annos153;
      term = d_38.invoke(context, c_167);
      if(term == null)
        break Fail183;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPostIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_167));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}