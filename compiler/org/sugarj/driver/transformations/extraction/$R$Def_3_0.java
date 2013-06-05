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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_17, Strategy x_17, Strategy y_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail58:
    { 
      IStrategoTerm h_108 = null;
      IStrategoTerm e_108 = null;
      IStrategoTerm f_108 = null;
      IStrategoTerm g_108 = null;
      IStrategoTerm i_108 = null;
      IStrategoTerm j_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      e_108 = term.getSubterm(0);
      f_108 = term.getSubterm(1);
      g_108 = term.getSubterm(2);
      IStrategoList annos31 = term.getAnnotations();
      h_108 = annos31;
      term = w_17.invoke(context, e_108);
      if(term == null)
        break Fail58;
      i_108 = term;
      term = x_17.invoke(context, f_108);
      if(term == null)
        break Fail58;
      j_108 = term;
      term = y_17.invoke(context, g_108);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDef_3, new IStrategoTerm[]{i_108, j_108, term}), checkListAnnos(termFactory, h_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}