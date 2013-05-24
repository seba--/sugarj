package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Rule$All$Named_3_0 extends Strategy 
{ 
  public static $Color$Rule$All$Named_3_0 instance = new $Color$Rule$All$Named_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_336, Strategy s_336, Strategy t_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleAllNamed_3_0");
    Fail787:
    { 
      IStrategoTerm w_431 = null;
      IStrategoTerm t_431 = null;
      IStrategoTerm u_431 = null;
      IStrategoTerm v_431 = null;
      IStrategoTerm x_431 = null;
      IStrategoTerm y_431 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorRuleAllNamed_3 != ((IStrategoAppl)term).getConstructor())
        break Fail787;
      t_431 = term.getSubterm(0);
      u_431 = term.getSubterm(1);
      v_431 = term.getSubterm(2);
      IStrategoList annos51 = term.getAnnotations();
      w_431 = annos51;
      term = r_336.invoke(context, t_431);
      if(term == null)
        break Fail787;
      x_431 = term;
      term = s_336.invoke(context, u_431);
      if(term == null)
        break Fail787;
      y_431 = term;
      term = t_336.invoke(context, v_431);
      if(term == null)
        break Fail787;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorRuleAllNamed_3, new IStrategoTerm[]{x_431, y_431, term}), checkListAnnos(termFactory, w_431));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}