package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $To$Model$Term_1_0 extends Strategy 
{ 
  public static $To$Model$Term_1_0 instance = new $To$Model$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ToModelTerm_1_0");
    Fail58:
    { 
      IStrategoTerm f_111 = null;
      IStrategoTerm e_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consToModelTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      e_111 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      f_111 = annos40;
      term = s_19.invoke(context, e_111);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consToModelTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}