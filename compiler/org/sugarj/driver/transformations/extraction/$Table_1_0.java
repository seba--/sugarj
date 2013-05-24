package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Table_1_0 extends Strategy 
{ 
  public static $Table_1_0 instance = new $Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Table_1_0");
    Fail826:
    { 
      IStrategoTerm p_435 = null;
      IStrategoTerm o_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTable_1 != ((IStrategoAppl)term).getConstructor())
        break Fail826;
      o_435 = term.getSubterm(0);
      IStrategoList annos74 = term.getAnnotations();
      p_435 = annos74;
      term = d_338.invoke(context, o_435);
      if(term == null)
        break Fail826;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTable_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}