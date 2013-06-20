package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unparameterized_1_0 extends Strategy 
{ 
  public static unparameterized_1_0 instance = new unparameterized_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unparameterized_1_0");
    Fail216:
    { 
      IStrategoTerm d_138 = null;
      IStrategoTerm c_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consunparameterized_1 != ((IStrategoAppl)term).getConstructor())
        break Fail216;
      c_138 = term.getSubterm(0);
      IStrategoList annos176 = term.getAnnotations();
      d_138 = annos176;
      term = a_27.invoke(context, c_138);
      if(term == null)
        break Fail216;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consunparameterized_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}