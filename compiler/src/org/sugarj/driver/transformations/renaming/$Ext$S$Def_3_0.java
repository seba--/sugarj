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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12, Strategy z_12, Strategy a_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail53:
    { 
      IStrategoTerm v_98 = null;
      IStrategoTerm q_98 = null;
      IStrategoTerm s_98 = null;
      IStrategoTerm t_98 = null;
      IStrategoTerm w_98 = null;
      IStrategoTerm x_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      q_98 = term.getSubterm(0);
      s_98 = term.getSubterm(1);
      t_98 = term.getSubterm(2);
      IStrategoList annos44 = term.getAnnotations();
      v_98 = annos44;
      term = y_12.invoke(context, q_98);
      if(term == null)
        break Fail53;
      w_98 = term;
      term = z_12.invoke(context, s_98);
      if(term == null)
        break Fail53;
      x_98 = term;
      term = a_13.invoke(context, t_98);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDef_3, new IStrategoTerm[]{w_98, x_98, term}), checkListAnnos(termFactory, v_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}