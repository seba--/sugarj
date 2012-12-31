package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_18, Strategy b_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail131:
    { 
      IStrategoTerm b_113 = null;
      IStrategoTerm z_112 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm c_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      z_112 = term.getSubterm(0);
      a_113 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      b_113 = annos121;
      term = a_18.invoke(context, z_112);
      if(term == null)
        break Fail131;
      c_113 = term;
      term = b_18.invoke(context, a_113);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAs_2, new IStrategoTerm[]{c_113, term}), checkListAnnos(termFactory, b_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}