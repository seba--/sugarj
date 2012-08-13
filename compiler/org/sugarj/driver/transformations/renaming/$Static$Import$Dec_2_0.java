package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Import$Dec_2_0 extends Strategy 
{ 
  public static $Static$Import$Dec_2_0 instance = new $Static$Import$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_19, Strategy y_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportDec_2_0");
    Fail62:
    { 
      IStrategoTerm v_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm u_111 = null;
      IStrategoTerm w_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      t_111 = term.getSubterm(0);
      u_111 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      v_111 = annos43;
      term = x_19.invoke(context, t_111);
      if(term == null)
        break Fail62;
      w_111 = term;
      term = y_19.invoke(context, u_111);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportDec_2, new IStrategoTerm[]{w_111, term}), checkListAnnos(termFactory, v_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}