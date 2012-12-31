package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$Dec$Head_2_0 extends Strategy 
{ 
  public static $Trans$Dec$Head_2_0 instance = new $Trans$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_27, Strategy x_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransDecHead_2_0");
    Fail45:
    { 
      IStrategoTerm x_127 = null;
      IStrategoTerm v_127 = null;
      IStrategoTerm w_127 = null;
      IStrategoTerm y_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTransDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      v_127 = term.getSubterm(0);
      w_127 = term.getSubterm(1);
      IStrategoList annos22 = term.getAnnotations();
      x_127 = annos22;
      term = w_27.invoke(context, v_127);
      if(term == null)
        break Fail45;
      y_127 = term;
      term = x_27.invoke(context, w_127);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTransDecHead_2, new IStrategoTerm[]{y_127, term}), checkListAnnos(termFactory, x_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}