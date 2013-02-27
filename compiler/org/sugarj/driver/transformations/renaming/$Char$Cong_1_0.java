package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char$Cong_1_0 extends Strategy 
{ 
  public static $Char$Cong_1_0 instance = new $Char$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail83:
    { 
      IStrategoTerm q_104 = null;
      IStrategoTerm p_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      p_104 = term.getSubterm(0);
      IStrategoList annos72 = term.getAnnotations();
      q_104 = annos72;
      term = d_15.invoke(context, p_104);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}