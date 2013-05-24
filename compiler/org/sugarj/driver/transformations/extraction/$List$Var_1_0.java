package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail926:
    { 
      IStrategoTerm g_452 = null;
      IStrategoTerm f_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail926;
      f_452 = term.getSubterm(0);
      IStrategoList annos171 = term.getAnnotations();
      g_452 = annos171;
      term = t_344.invoke(context, f_452);
      if(term == null)
        break Fail926;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}