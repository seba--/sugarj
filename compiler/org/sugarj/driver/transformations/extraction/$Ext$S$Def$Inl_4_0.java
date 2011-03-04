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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_19, Strategy i_19, Strategy j_19, Strategy k_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail69:
    { 
      IStrategoTerm h_112 = null;
      IStrategoTerm c_112 = null;
      IStrategoTerm d_112 = null;
      IStrategoTerm f_112 = null;
      IStrategoTerm g_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm j_112 = null;
      IStrategoTerm k_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      c_112 = term.getSubterm(0);
      d_112 = term.getSubterm(1);
      f_112 = term.getSubterm(2);
      g_112 = term.getSubterm(3);
      IStrategoList annos45 = term.getAnnotations();
      h_112 = annos45;
      term = h_19.invoke(context, c_112);
      if(term == null)
        break Fail69;
      i_112 = term;
      term = i_19.invoke(context, d_112);
      if(term == null)
        break Fail69;
      j_112 = term;
      term = j_19.invoke(context, f_112);
      if(term == null)
        break Fail69;
      k_112 = term;
      term = k_19.invoke(context, g_112);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExtSDefInl_4, new IStrategoTerm[]{i_112, j_112, k_112, term}), checkListAnnos(termFactory, h_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}