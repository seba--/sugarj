package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Float_1_0 extends Strategy 
{ 
  public static $Float_1_0 instance = new $Float_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Float_1_0");
    Fail194:
    { 
      IStrategoTerm f_136 = null;
      IStrategoTerm d_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      d_136 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      f_136 = annos162;
      term = v_26.invoke(context, d_136);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFloat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}