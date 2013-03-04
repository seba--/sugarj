package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_43, Strategy n_43, Strategy o_43, Strategy p_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail291:
    { 
      IStrategoTerm i_183 = null;
      IStrategoTerm e_183 = null;
      IStrategoTerm f_183 = null;
      IStrategoTerm g_183 = null;
      IStrategoTerm h_183 = null;
      IStrategoTerm j_183 = null;
      IStrategoTerm k_183 = null;
      IStrategoTerm l_183 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail291;
      e_183 = term.getSubterm(0);
      f_183 = term.getSubterm(1);
      g_183 = term.getSubterm(2);
      h_183 = term.getSubterm(3);
      IStrategoList annos238 = term.getAnnotations();
      i_183 = annos238;
      term = m_43.invoke(context, e_183);
      if(term == null)
        break Fail291;
      j_183 = term;
      term = n_43.invoke(context, f_183);
      if(term == null)
        break Fail291;
      k_183 = term;
      term = o_43.invoke(context, g_183);
      if(term == null)
        break Fail291;
      l_183 = term;
      term = p_43.invoke(context, h_183);
      if(term == null)
        break Fail291;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDefInl_4, new IStrategoTerm[]{j_183, k_183, l_183, term}), checkListAnnos(termFactory, i_183));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}