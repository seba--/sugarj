package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Outline$Rule_1_0 extends Strategy 
{ 
  public static $Outline$Rule_1_0 instance = new $Outline$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OutlineRule_1_0");
    Fail811:
    { 
      IStrategoTerm p_433 = null;
      IStrategoTerm o_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOutlineRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail811;
      o_433 = term.getSubterm(0);
      IStrategoList annos60 = term.getAnnotations();
      p_433 = annos60;
      term = k_337.invoke(context, o_433);
      if(term == null)
        break Fail811;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOutlineRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}