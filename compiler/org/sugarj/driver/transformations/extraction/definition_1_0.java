package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class definition_1_0 extends Strategy 
{ 
  public static definition_1_0 instance = new definition_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("definition_1_0");
    Fail173:
    { 
      IStrategoTerm a_129 = null;
      IStrategoTerm z_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consdefinition_1 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      z_128 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      a_129 = annos142;
      term = c_25.invoke(context, z_128);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consdefinition_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}