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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17, Strategy z_17, Strategy a_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail59:
    { 
      IStrategoTerm m_108 = null;
      IStrategoTerm j_108 = null;
      IStrategoTerm k_108 = null;
      IStrategoTerm l_108 = null;
      IStrategoTerm n_108 = null;
      IStrategoTerm o_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      j_108 = term.getSubterm(0);
      k_108 = term.getSubterm(1);
      l_108 = term.getSubterm(2);
      IStrategoList annos32 = term.getAnnotations();
      m_108 = annos32;
      term = y_17.invoke(context, j_108);
      if(term == null)
        break Fail59;
      n_108 = term;
      term = z_17.invoke(context, k_108);
      if(term == null)
        break Fail59;
      o_108 = term;
      term = a_18.invoke(context, l_108);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDef_3, new IStrategoTerm[]{n_108, o_108, term}), checkListAnnos(termFactory, m_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}