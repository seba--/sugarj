package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$App_2_0 extends Strategy 
{ 
  public static $Trans$App_2_0 instance = new $Trans$App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_333, Strategy y_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransApp_2_0");
    Fail735:
    { 
      IStrategoTerm p_424 = null;
      IStrategoTerm n_424 = null;
      IStrategoTerm o_424 = null;
      IStrategoTerm q_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTransApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail735;
      n_424 = term.getSubterm(0);
      o_424 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      p_424 = annos7;
      term = x_333.invoke(context, n_424);
      if(term == null)
        break Fail735;
      q_424 = term;
      term = y_333.invoke(context, o_424);
      if(term == null)
        break Fail735;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTransApp_2, new IStrategoTerm[]{q_424, term}), checkListAnnos(termFactory, p_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}