package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_345, Strategy l_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail939:
    { 
      IStrategoTerm c_454 = null;
      IStrategoTerm a_454 = null;
      IStrategoTerm b_454 = null;
      IStrategoTerm d_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail939;
      a_454 = term.getSubterm(0);
      b_454 = term.getSubterm(1);
      IStrategoList annos184 = term.getAnnotations();
      c_454 = annos184;
      term = k_345.invoke(context, a_454);
      if(term == null)
        break Fail939;
      d_454 = term;
      term = l_345.invoke(context, b_454);
      if(term == null)
        break Fail939;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAs_2, new IStrategoTerm[]{d_454, term}), checkListAnnos(termFactory, c_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}