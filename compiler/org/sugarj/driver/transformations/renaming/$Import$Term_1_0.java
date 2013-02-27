package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Term_1_0 extends Strategy 
{ 
  public static $Import$Term_1_0 instance = new $Import$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail98:
    { 
      IStrategoTerm v_106 = null;
      IStrategoTerm u_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      u_106 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      v_106 = annos87;
      term = x_15.invoke(context, u_106);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}