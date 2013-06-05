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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail71:
    { 
      IStrategoTerm j_110 = null;
      IStrategoTerm i_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      i_110 = term.getSubterm(0);
      IStrategoList annos44 = term.getAnnotations();
      j_110 = annos44;
      term = q_18.invoke(context, i_110);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}