package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail927:
    { 
      IStrategoTerm j_452 = null;
      IStrategoTerm i_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail927;
      i_452 = term.getSubterm(0);
      IStrategoList annos172 = term.getAnnotations();
      j_452 = annos172;
      term = u_344.invoke(context, i_452);
      if(term == null)
        break Fail927;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}