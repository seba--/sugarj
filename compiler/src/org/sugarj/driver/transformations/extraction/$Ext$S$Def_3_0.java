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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_19, Strategy g_19, Strategy h_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail80:
    { 
      IStrategoTerm h_112 = null;
      IStrategoTerm d_112 = null;
      IStrategoTerm f_112 = null;
      IStrategoTerm g_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm j_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      d_112 = term.getSubterm(0);
      f_112 = term.getSubterm(1);
      g_112 = term.getSubterm(2);
      IStrategoList annos53 = term.getAnnotations();
      h_112 = annos53;
      term = f_19.invoke(context, d_112);
      if(term == null)
        break Fail80;
      i_112 = term;
      term = g_19.invoke(context, f_112);
      if(term == null)
        break Fail80;
      j_112 = term;
      term = h_19.invoke(context, g_112);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consExtSDef_3, new IStrategoTerm[]{i_112, j_112, term}), checkListAnnos(termFactory, h_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}