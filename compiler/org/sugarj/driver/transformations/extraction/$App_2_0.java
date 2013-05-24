package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $App_2_0 extends Strategy 
{ 
  public static $App_2_0 instance = new $App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_345, Strategy c_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail933:
    { 
      IStrategoTerm e_453 = null;
      IStrategoTerm c_453 = null;
      IStrategoTerm d_453 = null;
      IStrategoTerm f_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail933;
      c_453 = term.getSubterm(0);
      d_453 = term.getSubterm(1);
      IStrategoList annos178 = term.getAnnotations();
      e_453 = annos178;
      term = b_345.invoke(context, c_453);
      if(term == null)
        break Fail933;
      f_453 = term;
      term = c_345.invoke(context, d_453);
      if(term == null)
        break Fail933;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consApp_2, new IStrategoTerm[]{f_453, term}), checkListAnnos(termFactory, e_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}