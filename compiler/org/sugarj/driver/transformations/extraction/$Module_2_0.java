package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_348, Strategy b_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail983:
    { 
      IStrategoTerm v_460 = null;
      IStrategoTerm t_460 = null;
      IStrategoTerm u_460 = null;
      IStrategoTerm w_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail983;
      t_460 = term.getSubterm(0);
      u_460 = term.getSubterm(1);
      IStrategoList annos223 = term.getAnnotations();
      v_460 = annos223;
      term = a_348.invoke(context, t_460);
      if(term == null)
        break Fail983;
      w_460 = term;
      term = b_348.invoke(context, u_460);
      if(term == null)
        break Fail983;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consModule_2, new IStrategoTerm[]{w_460, term}), checkListAnnos(termFactory, v_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}