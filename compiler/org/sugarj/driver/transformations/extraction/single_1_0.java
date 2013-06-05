package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class single_1_0 extends Strategy 
{ 
  public static single_1_0 instance = new single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("single_1_0");
    Fail177:
    { 
      IStrategoTerm a_130 = null;
      IStrategoTerm z_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      z_129 = term.getSubterm(0);
      IStrategoList annos146 = term.getAnnotations();
      a_130 = annos146;
      term = j_25.invoke(context, z_129);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}