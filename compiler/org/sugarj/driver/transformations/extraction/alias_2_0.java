package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alias_2_0 extends Strategy 
{ 
  public static alias_2_0 instance = new alias_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_25, Strategy e_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alias_2_0");
    Fail174:
    { 
      IStrategoTerm e_129 = null;
      IStrategoTerm c_129 = null;
      IStrategoTerm d_129 = null;
      IStrategoTerm f_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consalias_2 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      c_129 = term.getSubterm(0);
      d_129 = term.getSubterm(1);
      IStrategoList annos143 = term.getAnnotations();
      e_129 = annos143;
      term = d_25.invoke(context, c_129);
      if(term == null)
        break Fail174;
      f_129 = term;
      term = e_25.invoke(context, d_129);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consalias_2, new IStrategoTerm[]{f_129, term}), checkListAnnos(termFactory, e_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}