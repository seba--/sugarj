package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim_2_0 extends Strategy 
{ 
  public static $Prim_2_0 instance = new $Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_21, Strategy v_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail113:
    { 
      IStrategoTerm y_118 = null;
      IStrategoTerm w_118 = null;
      IStrategoTerm x_118 = null;
      IStrategoTerm z_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      w_118 = term.getSubterm(0);
      x_118 = term.getSubterm(1);
      IStrategoList annos85 = term.getAnnotations();
      y_118 = annos85;
      term = u_21.invoke(context, w_118);
      if(term == null)
        break Fail113;
      z_118 = term;
      term = v_21.invoke(context, x_118);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consPrim_2, new IStrategoTerm[]{z_118, term}), checkListAnnos(termFactory, y_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}