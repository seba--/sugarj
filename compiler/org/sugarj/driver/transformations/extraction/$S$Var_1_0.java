package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Var_1_0 extends Strategy 
{ 
  public static $S$Var_1_0 instance = new $S$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail964:
    { 
      IStrategoTerm j_457 = null;
      IStrategoTerm i_457 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail964;
      i_457 = term.getSubterm(0);
      IStrategoList annos206 = term.getAnnotations();
      j_457 = annos206;
      term = q_346.invoke(context, i_457);
      if(term == null)
        break Fail964;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_457));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}