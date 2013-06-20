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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("definition_1_0");
    Fail174:
    { 
      IStrategoTerm f_129 = null;
      IStrategoTerm e_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consdefinition_1 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      e_129 = term.getSubterm(0);
      IStrategoList annos143 = term.getAnnotations();
      f_129 = annos143;
      term = e_25.invoke(context, e_129);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consdefinition_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}