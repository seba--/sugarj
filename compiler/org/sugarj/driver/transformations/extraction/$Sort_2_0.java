package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_345, Strategy v_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail949:
    { 
      IStrategoTerm e_455 = null;
      IStrategoTerm c_455 = null;
      IStrategoTerm d_455 = null;
      IStrategoTerm f_455 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail949;
      c_455 = term.getSubterm(0);
      d_455 = term.getSubterm(1);
      IStrategoList annos192 = term.getAnnotations();
      e_455 = annos192;
      term = u_345.invoke(context, c_455);
      if(term == null)
        break Fail949;
      f_455 = term;
      term = v_345.invoke(context, d_455);
      if(term == null)
        break Fail949;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{f_455, term}), checkListAnnos(termFactory, e_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}