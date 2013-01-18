package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail309:
    { 
      IStrategoTerm p_187 = null;
      IStrategoTerm o_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail309;
      o_187 = term.getSubterm(0);
      IStrategoList annos256 = term.getAnnotations();
      p_187 = annos256;
      term = f_45.invoke(context, o_187);
      if(term == null)
        break Fail309;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}