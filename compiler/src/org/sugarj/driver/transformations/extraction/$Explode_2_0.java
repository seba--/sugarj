package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode_2_0 extends Strategy 
{ 
  public static $Explode_2_0 instance = new $Explode_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_24, Strategy v_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail167:
    { 
      IStrategoTerm d_128 = null;
      IStrategoTerm b_128 = null;
      IStrategoTerm c_128 = null;
      IStrategoTerm e_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      b_128 = term.getSubterm(0);
      c_128 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      d_128 = annos136;
      term = u_24.invoke(context, b_128);
      if(term == null)
        break Fail167;
      e_128 = term;
      term = v_24.invoke(context, c_128);
      if(term == null)
        break Fail167;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consExplode_2, new IStrategoTerm[]{e_128, term}), checkListAnnos(termFactory, d_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}