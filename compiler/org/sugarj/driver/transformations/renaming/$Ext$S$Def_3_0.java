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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_12, Strategy w_12, Strategy x_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail54:
    { 
      IStrategoTerm q_98 = null;
      IStrategoTerm l_98 = null;
      IStrategoTerm n_98 = null;
      IStrategoTerm o_98 = null;
      IStrategoTerm s_98 = null;
      IStrategoTerm t_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      l_98 = term.getSubterm(0);
      n_98 = term.getSubterm(1);
      o_98 = term.getSubterm(2);
      IStrategoList annos44 = term.getAnnotations();
      q_98 = annos44;
      term = v_12.invoke(context, l_98);
      if(term == null)
        break Fail54;
      s_98 = term;
      term = w_12.invoke(context, n_98);
      if(term == null)
        break Fail54;
      t_98 = term;
      term = x_12.invoke(context, o_98);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDef_3, new IStrategoTerm[]{s_98, t_98, term}), checkListAnnos(termFactory, q_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}