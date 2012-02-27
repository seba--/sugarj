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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_14, Strategy v_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportDec_2_0");
    Fail16:
    { 
      IStrategoTerm u_99 = null;
      IStrategoTerm s_99 = null;
      IStrategoTerm t_99 = null;
      IStrategoTerm v_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      s_99 = term.getSubterm(0);
      t_99 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      u_99 = annos2;
      term = u_14.invoke(context, s_99);
      if(term == null)
        break Fail16;
      v_99 = term;
      term = v_14.invoke(context, t_99);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportDec_2, new IStrategoTerm[]{v_99, term}), checkListAnnos(termFactory, u_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}