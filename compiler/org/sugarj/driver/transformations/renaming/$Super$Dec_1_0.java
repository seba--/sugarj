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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperDec_1_0");
    Fail31:
    { 
      IStrategoTerm j_102 = null;
      IStrategoTerm i_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      i_102 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      j_102 = annos22;
      term = g_15.invoke(context, i_102);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}