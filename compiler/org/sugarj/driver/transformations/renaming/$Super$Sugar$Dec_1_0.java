package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Sugar$Dec_1_0 extends Strategy 
{ 
  public static $Super$Sugar$Dec_1_0 instance = new $Super$Sugar$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperSugarDec_1_0");
    Fail20:
    { 
      IStrategoTerm w_104 = null;
      IStrategoTerm v_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperSugarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      v_104 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      w_104 = annos2;
      term = p_17.invoke(context, v_104);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperSugarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}