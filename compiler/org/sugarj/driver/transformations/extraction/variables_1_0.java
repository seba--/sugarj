package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class variables_1_0 extends Strategy 
{ 
  public static variables_1_0 instance = new variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("variables_1_0");
    Fail266:
    { 
      IStrategoTerm u_147 = null;
      IStrategoTerm t_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consvariables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail266;
      t_147 = term.getSubterm(0);
      IStrategoList annos218 = term.getAnnotations();
      u_147 = annos218;
      term = f_29.invoke(context, t_147);
      if(term == null)
        break Fail266;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consvariables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}