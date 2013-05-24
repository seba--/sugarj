package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $To$Model$Term_1_0 extends Strategy 
{ 
  public static $To$Model$Term_1_0 instance = new $To$Model$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ToModelTerm_1_0");
    Fail729:
    { 
      IStrategoTerm u_423 = null;
      IStrategoTerm t_423 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consToModelTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail729;
      t_423 = term.getSubterm(0);
      IStrategoList annos1 = term.getAnnotations();
      u_423 = annos1;
      term = q_333.invoke(context, t_423);
      if(term == null)
        break Fail729;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consToModelTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_423));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}