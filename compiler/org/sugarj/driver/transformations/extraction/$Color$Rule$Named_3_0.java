package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Rule$Named_3_0 extends Strategy 
{ 
  public static $Color$Rule$Named_3_0 instance = new $Color$Rule$Named_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_336, Strategy v_336, Strategy w_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleNamed_3_0");
    Fail788:
    { 
      IStrategoTerm d_432 = null;
      IStrategoTerm a_432 = null;
      IStrategoTerm b_432 = null;
      IStrategoTerm c_432 = null;
      IStrategoTerm e_432 = null;
      IStrategoTerm f_432 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorRuleNamed_3 != ((IStrategoAppl)term).getConstructor())
        break Fail788;
      a_432 = term.getSubterm(0);
      b_432 = term.getSubterm(1);
      c_432 = term.getSubterm(2);
      IStrategoList annos52 = term.getAnnotations();
      d_432 = annos52;
      term = u_336.invoke(context, a_432);
      if(term == null)
        break Fail788;
      e_432 = term;
      term = v_336.invoke(context, b_432);
      if(term == null)
        break Fail788;
      f_432 = term;
      term = w_336.invoke(context, c_432);
      if(term == null)
        break Fail788;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorRuleNamed_3, new IStrategoTerm[]{e_432, f_432, term}), checkListAnnos(termFactory, d_432));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}