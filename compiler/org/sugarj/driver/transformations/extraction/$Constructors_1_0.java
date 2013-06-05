package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructors_1_0 extends Strategy 
{ 
  public static $Constructors_1_0 instance = new $Constructors_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail152:
    { 
      IStrategoTerm z_125 = null;
      IStrategoTerm y_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      y_125 = term.getSubterm(0);
      IStrategoList annos122 = term.getAnnotations();
      z_125 = annos122;
      term = b_24.invoke(context, y_125);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}