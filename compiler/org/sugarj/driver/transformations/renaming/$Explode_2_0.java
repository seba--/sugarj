package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_48, Strategy v_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail374:
    { 
      IStrategoTerm e_198 = null;
      IStrategoTerm c_198 = null;
      IStrategoTerm d_198 = null;
      IStrategoTerm f_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail374;
      c_198 = term.getSubterm(0);
      d_198 = term.getSubterm(1);
      IStrategoList annos317 = term.getAnnotations();
      e_198 = annos317;
      term = u_48.invoke(context, c_198);
      if(term == null)
        break Fail374;
      f_198 = term;
      term = v_48.invoke(context, d_198);
      if(term == null)
        break Fail374;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplode_2, new IStrategoTerm[]{f_198, term}), checkListAnnos(termFactory, e_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}