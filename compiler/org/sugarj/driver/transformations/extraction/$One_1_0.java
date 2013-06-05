package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $One_1_0 extends Strategy 
{ 
  public static $One_1_0 instance = new $One_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail125:
    { 
      IStrategoTerm a_121 = null;
      IStrategoTerm z_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      z_120 = term.getSubterm(0);
      IStrategoList annos97 = term.getAnnotations();
      a_121 = annos97;
      term = k_22.invoke(context, z_120);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}