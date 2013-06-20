package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportTerm_1_0");
    Fail124:
    { 
      IStrategoTerm z_120 = null;
      IStrategoTerm y_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consImportTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      y_120 = term.getSubterm(0);
      IStrategoList annos96 = term.getAnnotations();
      z_120 = annos96;
      term = k_22.invoke(context, y_120);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consImportTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}