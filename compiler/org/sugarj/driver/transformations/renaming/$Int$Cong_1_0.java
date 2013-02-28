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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail85:
    { 
      IStrategoTerm z_104 = null;
      IStrategoTerm y_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      y_104 = term.getSubterm(0);
      IStrategoList annos74 = term.getAnnotations();
      z_104 = annos74;
      term = i_15.invoke(context, y_104);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}