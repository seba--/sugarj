package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Name_1_0 extends Strategy 
{ 
  public static $Method$Name_1_0 instance = new $Method$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_1_0");
    Fail216:
    { 
      IStrategoTerm r_149 = null;
      IStrategoTerm q_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail216;
      q_149 = term.getSubterm(0);
      IStrategoList annos190 = term.getAnnotations();
      r_149 = annos190;
      term = i_31.invoke(context, q_149);
      if(term == null)
        break Fail216;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}