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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecStm_1_0");
    Fail107:
    { 
      IStrategoTerm k_148 = null;
      IStrategoTerm j_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      j_148 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      k_148 = annos81;
      term = c_33.invoke(context, j_148);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}