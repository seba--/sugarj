package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real$Cong_1_0 extends Strategy 
{ 
  public static $Real$Cong_1_0 instance = new $Real$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail319:
    { 
      IStrategoTerm a_189 = null;
      IStrategoTerm z_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail319;
      z_188 = term.getSubterm(0);
      IStrategoList annos265 = term.getAnnotations();
      a_189 = annos265;
      term = t_45.invoke(context, z_188);
      if(term == null)
        break Fail319;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}