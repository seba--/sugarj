package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real$Cong_1_0 extends Strategy 
{ 
  public static $Real$Cong_1_0 instance = new $Real$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail80:
    { 
      IStrategoTerm u_104 = null;
      IStrategoTerm t_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      t_104 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      u_104 = annos73;
      term = f_15.invoke(context, t_104);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}