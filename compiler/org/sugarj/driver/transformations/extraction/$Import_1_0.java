package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import_1_0 extends Strategy 
{ 
  public static $Import_1_0 instance = new $Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail66:
    { 
      IStrategoTerm u_109 = null;
      IStrategoTerm t_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      t_109 = term.getSubterm(0);
      IStrategoList annos39 = term.getAnnotations();
      u_109 = annos39;
      term = l_18.invoke(context, t_109);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}