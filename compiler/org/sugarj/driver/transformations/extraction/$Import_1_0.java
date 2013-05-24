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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail850:
    { 
      IStrategoTerm p_438 = null;
      IStrategoTerm o_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail850;
      o_438 = term.getSubterm(0);
      IStrategoList annos96 = term.getAnnotations();
      p_438 = annos96;
      term = j_339.invoke(context, o_438);
      if(term == null)
        break Fail850;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}