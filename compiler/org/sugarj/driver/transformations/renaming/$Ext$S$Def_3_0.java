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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_12, Strategy t_12, Strategy u_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail54:
    { 
      IStrategoTerm l_98 = null;
      IStrategoTerm h_98 = null;
      IStrategoTerm i_98 = null;
      IStrategoTerm j_98 = null;
      IStrategoTerm n_98 = null;
      IStrategoTerm o_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      h_98 = term.getSubterm(0);
      i_98 = term.getSubterm(1);
      j_98 = term.getSubterm(2);
      IStrategoList annos44 = term.getAnnotations();
      l_98 = annos44;
      term = s_12.invoke(context, h_98);
      if(term == null)
        break Fail54;
      n_98 = term;
      term = t_12.invoke(context, i_98);
      if(term == null)
        break Fail54;
      o_98 = term;
      term = u_12.invoke(context, j_98);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDef_3, new IStrategoTerm[]{n_98, o_98, term}), checkListAnnos(termFactory, l_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}