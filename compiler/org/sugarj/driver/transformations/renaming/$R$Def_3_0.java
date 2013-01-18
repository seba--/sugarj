package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_42, Strategy f_42, Strategy g_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail270:
    { 
      IStrategoTerm k_179 = null;
      IStrategoTerm h_179 = null;
      IStrategoTerm i_179 = null;
      IStrategoTerm j_179 = null;
      IStrategoTerm l_179 = null;
      IStrategoTerm m_179 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail270;
      h_179 = term.getSubterm(0);
      i_179 = term.getSubterm(1);
      j_179 = term.getSubterm(2);
      IStrategoList annos217 = term.getAnnotations();
      k_179 = annos217;
      term = e_42.invoke(context, h_179);
      if(term == null)
        break Fail270;
      l_179 = term;
      term = f_42.invoke(context, i_179);
      if(term == null)
        break Fail270;
      m_179 = term;
      term = g_42.invoke(context, j_179);
      if(term == null)
        break Fail270;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{l_179, m_179, term}), checkListAnnos(termFactory, k_179));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}