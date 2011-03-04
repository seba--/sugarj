package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def_3_0 extends Strategy 
{ 
  public static $R$Def_3_0 instance = new $R$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_17, Strategy y_17, Strategy z_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail47:
    { 
      IStrategoTerm e_108 = null;
      IStrategoTerm b_108 = null;
      IStrategoTerm c_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm f_108 = null;
      IStrategoTerm g_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      b_108 = term.getSubterm(0);
      c_108 = term.getSubterm(1);
      d_108 = term.getSubterm(2);
      IStrategoList annos23 = term.getAnnotations();
      e_108 = annos23;
      term = x_17.invoke(context, b_108);
      if(term == null)
        break Fail47;
      f_108 = term;
      term = y_17.invoke(context, c_108);
      if(term == null)
        break Fail47;
      g_108 = term;
      term = z_17.invoke(context, d_108);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDef_3, new IStrategoTerm[]{f_108, g_108, term}), checkListAnnos(termFactory, e_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}