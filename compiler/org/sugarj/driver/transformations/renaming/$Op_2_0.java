package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op_2_0 extends Strategy 
{ 
  public static $Op_2_0 instance = new $Op_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_48, Strategy z_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail376:
    { 
      IStrategoTerm p_198 = null;
      IStrategoTerm n_198 = null;
      IStrategoTerm o_198 = null;
      IStrategoTerm q_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail376;
      n_198 = term.getSubterm(0);
      o_198 = term.getSubterm(1);
      IStrategoList annos319 = term.getAnnotations();
      p_198 = annos319;
      term = y_48.invoke(context, n_198);
      if(term == null)
        break Fail376;
      q_198 = term;
      term = z_48.invoke(context, o_198);
      if(term == null)
        break Fail376;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOp_2, new IStrategoTerm[]{q_198, term}), checkListAnnos(termFactory, p_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}