package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_1_0 extends Strategy 
{ 
  public static $Minus_1_0 instance = new $Minus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_1_0");
    Fail180:
    { 
      IStrategoTerm u_166 = null;
      IStrategoTerm t_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMinus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      t_166 = term.getSubterm(0);
      IStrategoList annos150 = term.getAnnotations();
      u_166 = annos150;
      term = a_38.invoke(context, t_166);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMinus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}