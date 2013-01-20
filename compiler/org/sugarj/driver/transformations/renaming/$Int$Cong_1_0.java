package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int$Cong_1_0 extends Strategy 
{ 
  public static $Int$Cong_1_0 instance = new $Int$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail320:
    { 
      IStrategoTerm d_189 = null;
      IStrategoTerm c_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail320;
      c_189 = term.getSubterm(0);
      IStrategoList annos266 = term.getAnnotations();
      d_189 = annos266;
      term = u_45.invoke(context, c_189);
      if(term == null)
        break Fail320;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}