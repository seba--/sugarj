package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Prim_2_0 extends Strategy 
{ 
  public static $Cast$Prim_2_0 instance = new $Cast$Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_37, Strategy v_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastPrim_2_0");
    Fail175:
    { 
      IStrategoTerm b_166 = null;
      IStrategoTerm z_165 = null;
      IStrategoTerm a_166 = null;
      IStrategoTerm c_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      z_165 = term.getSubterm(0);
      a_166 = term.getSubterm(1);
      IStrategoList annos145 = term.getAnnotations();
      b_166 = annos145;
      term = u_37.invoke(context, z_165);
      if(term == null)
        break Fail175;
      c_166 = term;
      term = v_37.invoke(context, a_166);
      if(term == null)
        break Fail175;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCastPrim_2, new IStrategoTerm[]{c_166, term}), checkListAnnos(termFactory, b_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}