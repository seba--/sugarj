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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVarDec_1_0");
    Fail76:
    { 
      IStrategoTerm i_111 = null;
      IStrategoTerm h_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      h_111 = term.getSubterm(0);
      IStrategoList annos49 = term.getAnnotations();
      i_111 = annos49;
      term = x_18.invoke(context, h_111);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDefaultVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}