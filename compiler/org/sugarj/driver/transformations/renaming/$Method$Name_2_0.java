package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Name_2_0 extends Strategy 
{ 
  public static $Method$Name_2_0 instance = new $Method$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_25, Strategy w_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_2_0");
    Fail167:
    { 
      IStrategoTerm a_131 = null;
      IStrategoTerm x_130 = null;
      IStrategoTerm y_130 = null;
      IStrategoTerm c_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      x_130 = term.getSubterm(0);
      y_130 = term.getSubterm(1);
      IStrategoList annos148 = term.getAnnotations();
      a_131 = annos148;
      term = v_25.invoke(context, x_130);
      if(term == null)
        break Fail167;
      c_131 = term;
      term = w_25.invoke(context, y_130);
      if(term == null)
        break Fail167;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodName_2, new IStrategoTerm[]{c_131, term}), checkListAnnos(termFactory, a_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}