package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Dec_1_0 extends Strategy 
{ 
  public static $Super$Dec_1_0 instance = new $Super$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperDec_1_0");
    Fail34:
    { 
      IStrategoTerm z_102 = null;
      IStrategoTerm y_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      y_102 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      z_102 = annos22;
      term = v_15.invoke(context, y_102);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}