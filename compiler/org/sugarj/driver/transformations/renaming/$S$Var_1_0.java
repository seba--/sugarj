package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail111:
    { 
      IStrategoTerm o_109 = null;
      IStrategoTerm n_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      n_109 = term.getSubterm(0);
      IStrategoList annos99 = term.getAnnotations();
      o_109 = annos99;
      term = a_17.invoke(context, n_109);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}