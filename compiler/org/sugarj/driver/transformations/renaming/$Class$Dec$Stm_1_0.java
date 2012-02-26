package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Class$Dec$Stm_1_0 instance = new $Class$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecStm_1_0");
    Fail69:
    { 
      IStrategoTerm f_112 = null;
      IStrategoTerm d_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      d_112 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      f_112 = annos55;
      term = j_19.invoke(context, d_112);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}