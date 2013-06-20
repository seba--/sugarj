package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class cf_1_0 extends Strategy 
{ 
  public static cf_1_0 instance = new cf_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("cf_1_0");
    Fail242:
    { 
      IStrategoTerm x_143 = null;
      IStrategoTerm w_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscf_1 != ((IStrategoAppl)term).getConstructor())
        break Fail242;
      w_143 = term.getSubterm(0);
      IStrategoList annos199 = term.getAnnotations();
      x_143 = annos199;
      term = i_28.invoke(context, w_143);
      if(term == null)
        break Fail242;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscf_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}