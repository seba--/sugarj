package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Imports_1_0 extends Strategy 
{ 
  public static $Imports_1_0 instance = new $Imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail72:
    { 
      IStrategoTerm o_110 = null;
      IStrategoTerm n_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      n_110 = term.getSubterm(0);
      IStrategoList annos45 = term.getAnnotations();
      o_110 = annos45;
      term = s_18.invoke(context, n_110);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}