package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_1_0 extends Strategy 
{ 
  public static $Method_1_0 instance = new $Method_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_1_0");
    Fail64:
    { 
      IStrategoTerm f_132 = null;
      IStrategoTerm e_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethod_1 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      e_132 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      f_132 = annos40;
      term = c_29.invoke(context, e_132);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethod_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}