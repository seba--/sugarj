package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Default$Var$Dec_1_0 extends Strategy 
{ 
  public static $Default$Var$Dec_1_0 instance = new $Default$Var$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVarDec_1_0");
    Fail75:
    { 
      IStrategoTerm d_111 = null;
      IStrategoTerm b_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      b_111 = term.getSubterm(0);
      IStrategoList annos48 = term.getAnnotations();
      d_111 = annos48;
      term = v_18.invoke(context, b_111);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDefaultVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}