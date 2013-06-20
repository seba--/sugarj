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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_19, Strategy j_19, Strategy k_19, Strategy l_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail81:
    { 
      IStrategoTerm p_112 = null;
      IStrategoTerm l_112 = null;
      IStrategoTerm m_112 = null;
      IStrategoTerm n_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm q_112 = null;
      IStrategoTerm r_112 = null;
      IStrategoTerm s_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      l_112 = term.getSubterm(0);
      m_112 = term.getSubterm(1);
      n_112 = term.getSubterm(2);
      o_112 = term.getSubterm(3);
      IStrategoList annos54 = term.getAnnotations();
      p_112 = annos54;
      term = i_19.invoke(context, l_112);
      if(term == null)
        break Fail81;
      q_112 = term;
      term = j_19.invoke(context, m_112);
      if(term == null)
        break Fail81;
      r_112 = term;
      term = k_19.invoke(context, n_112);
      if(term == null)
        break Fail81;
      s_112 = term;
      term = l_19.invoke(context, o_112);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consExtSDefInl_4, new IStrategoTerm[]{q_112, r_112, s_112, term}), checkListAnnos(termFactory, p_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}