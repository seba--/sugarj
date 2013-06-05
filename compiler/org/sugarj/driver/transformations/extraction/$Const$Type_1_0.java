package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Const$Type_1_0 extends Strategy 
{ 
  public static $Const$Type_1_0 instance = new $Const$Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail139:
    { 
      IStrategoTerm p_123 = null;
      IStrategoTerm o_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      o_123 = term.getSubterm(0);
      IStrategoList annos109 = term.getAnnotations();
      p_123 = annos109;
      term = i_23.invoke(context, o_123);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}