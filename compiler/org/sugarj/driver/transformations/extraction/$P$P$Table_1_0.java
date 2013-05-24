package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $P$P$Table_1_0 extends Strategy 
{ 
  public static $P$P$Table_1_0 instance = new $P$P$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PPTable_1_0");
    Fail756:
    { 
      IStrategoTerm j_427 = null;
      IStrategoTerm i_427 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPPTable_1 != ((IStrategoAppl)term).getConstructor())
        break Fail756;
      i_427 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      j_427 = annos28;
      term = x_334.invoke(context, i_427);
      if(term == null)
        break Fail756;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPPTable_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_427));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}