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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_347, Strategy i_347, Strategy j_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail970:
    { 
      IStrategoTerm z_458 = null;
      IStrategoTerm w_458 = null;
      IStrategoTerm x_458 = null;
      IStrategoTerm y_458 = null;
      IStrategoTerm a_459 = null;
      IStrategoTerm b_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail970;
      w_458 = term.getSubterm(0);
      x_458 = term.getSubterm(1);
      y_458 = term.getSubterm(2);
      IStrategoList annos212 = term.getAnnotations();
      z_458 = annos212;
      term = h_347.invoke(context, w_458);
      if(term == null)
        break Fail970;
      a_459 = term;
      term = i_347.invoke(context, x_458);
      if(term == null)
        break Fail970;
      b_459 = term;
      term = j_347.invoke(context, y_458);
      if(term == null)
        break Fail970;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtSDef_3, new IStrategoTerm[]{a_459, b_459, term}), checkListAnnos(termFactory, z_458));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}