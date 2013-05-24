package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_346, Strategy n_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail962:
    { 
      IStrategoTerm a_457 = null;
      IStrategoTerm y_456 = null;
      IStrategoTerm z_456 = null;
      IStrategoTerm b_457 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail962;
      y_456 = term.getSubterm(0);
      z_456 = term.getSubterm(1);
      IStrategoList annos204 = term.getAnnotations();
      a_457 = annos204;
      term = m_346.invoke(context, y_456);
      if(term == null)
        break Fail962;
      b_457 = term;
      term = n_346.invoke(context, z_456);
      if(term == null)
        break Fail962;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOp_2, new IStrategoTerm[]{b_457, term}), checkListAnnos(termFactory, a_457));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}