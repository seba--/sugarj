package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Method_2_0 extends Strategy 
{ 
  public static $Super$Method_2_0 instance = new $Super$Method_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_28, Strategy y_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperMethod_2_0");
    Fail62:
    { 
      IStrategoTerm n_131 = null;
      IStrategoTerm j_131 = null;
      IStrategoTerm l_131 = null;
      IStrategoTerm s_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSuperMethod_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      j_131 = term.getSubterm(0);
      l_131 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      n_131 = annos38;
      term = x_28.invoke(context, j_131);
      if(term == null)
        break Fail62;
      s_131 = term;
      term = y_28.invoke(context, l_131);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSuperMethod_2, new IStrategoTerm[]{s_131, term}), checkListAnnos(termFactory, n_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}