package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_1_0 extends Strategy 
{ 
  public static $Plus_1_0 instance = new $Plus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_1_0");
    Fail181:
    { 
      IStrategoTerm x_166 = null;
      IStrategoTerm w_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPlus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      w_166 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      x_166 = annos151;
      term = b_38.invoke(context, w_166);
      if(term == null)
        break Fail181;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPlus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}