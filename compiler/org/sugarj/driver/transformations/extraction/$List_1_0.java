package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List_1_0 extends Strategy 
{ 
  public static $List_1_0 instance = new $List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("List_1_0");
    Fail936:
    { 
      IStrategoTerm o_453 = null;
      IStrategoTerm n_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail936;
      n_453 = term.getSubterm(0);
      IStrategoList annos181 = term.getAnnotations();
      o_453 = annos181;
      term = f_345.invoke(context, n_453);
      if(term == null)
        break Fail936;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}