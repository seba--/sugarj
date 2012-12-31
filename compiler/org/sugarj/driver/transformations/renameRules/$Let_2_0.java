package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_16, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail107:
    { 
      IStrategoTerm e_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm d_109 = null;
      IStrategoTerm f_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      c_109 = term.getSubterm(0);
      d_109 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      e_109 = annos98;
      term = t_16.invoke(context, c_109);
      if(term == null)
        break Fail107;
      f_109 = term;
      term = u_16.invoke(context, d_109);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLet_2, new IStrategoTerm[]{f_109, term}), checkListAnnos(termFactory, e_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}