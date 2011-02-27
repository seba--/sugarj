package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_19, Strategy f_19, Strategy g_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail67:
    { 
      IStrategoTerm y_111 = null;
      IStrategoTerm v_111 = null;
      IStrategoTerm w_111 = null;
      IStrategoTerm x_111 = null;
      IStrategoTerm z_111 = null;
      IStrategoTerm a_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      v_111 = term.getSubterm(0);
      w_111 = term.getSubterm(1);
      x_111 = term.getSubterm(2);
      IStrategoList annos44 = term.getAnnotations();
      y_111 = annos44;
      term = e_19.invoke(context, v_111);
      if(term == null)
        break Fail67;
      z_111 = term;
      term = f_19.invoke(context, w_111);
      if(term == null)
        break Fail67;
      a_112 = term;
      term = g_19.invoke(context, x_111);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExtSDef_3, new IStrategoTerm[]{z_111, a_112, term}), checkListAnnos(termFactory, y_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}