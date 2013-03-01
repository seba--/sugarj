package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Var_1_0 extends Strategy 
{ 
  public static $List$Var_1_0 instance = new $List$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail276:
    { 
      IStrategoTerm o_180 = null;
      IStrategoTerm n_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail276;
      n_180 = term.getSubterm(0);
      IStrategoList annos223 = term.getAnnotations();
      o_180 = annos223;
      term = r_42.invoke(context, n_180);
      if(term == null)
        break Fail276;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}