package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$S$Def$Inl_4_0 extends Strategy 
{ 
  public static $Ext$S$Def$Inl_4_0 instance = new $Ext$S$Def$Inl_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_19, Strategy h_19, Strategy i_19, Strategy j_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail80:
    { 
      IStrategoTerm k_112 = null;
      IStrategoTerm g_112 = null;
      IStrategoTerm h_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm j_112 = null;
      IStrategoTerm l_112 = null;
      IStrategoTerm m_112 = null;
      IStrategoTerm n_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      g_112 = term.getSubterm(0);
      h_112 = term.getSubterm(1);
      i_112 = term.getSubterm(2);
      j_112 = term.getSubterm(3);
      IStrategoList annos53 = term.getAnnotations();
      k_112 = annos53;
      term = g_19.invoke(context, g_112);
      if(term == null)
        break Fail80;
      l_112 = term;
      term = h_19.invoke(context, h_112);
      if(term == null)
        break Fail80;
      m_112 = term;
      term = i_19.invoke(context, i_112);
      if(term == null)
        break Fail80;
      n_112 = term;
      term = j_19.invoke(context, j_112);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consExtSDefInl_4, new IStrategoTerm[]{l_112, m_112, n_112, term}), checkListAnnos(termFactory, k_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}