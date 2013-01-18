package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$S$Def_3_0 extends Strategy 
{ 
  public static $Ext$S$Def_3_0 instance = new $Ext$S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_43, Strategy k_43, Strategy l_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail290:
    { 
      IStrategoTerm x_182 = null;
      IStrategoTerm u_182 = null;
      IStrategoTerm v_182 = null;
      IStrategoTerm w_182 = null;
      IStrategoTerm y_182 = null;
      IStrategoTerm z_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail290;
      u_182 = term.getSubterm(0);
      v_182 = term.getSubterm(1);
      w_182 = term.getSubterm(2);
      IStrategoList annos237 = term.getAnnotations();
      x_182 = annos237;
      term = j_43.invoke(context, u_182);
      if(term == null)
        break Fail290;
      y_182 = term;
      term = k_43.invoke(context, v_182);
      if(term == null)
        break Fail290;
      z_182 = term;
      term = l_43.invoke(context, w_182);
      if(term == null)
        break Fail290;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDef_3, new IStrategoTerm[]{y_182, z_182, term}), checkListAnnos(termFactory, x_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}