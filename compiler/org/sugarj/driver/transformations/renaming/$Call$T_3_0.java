package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$T_3_0 extends Strategy 
{ 
  public static $Call$T_3_0 instance = new $Call$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_47, Strategy e_47, Strategy f_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail344:
    { 
      IStrategoTerm f_193 = null;
      IStrategoTerm c_193 = null;
      IStrategoTerm d_193 = null;
      IStrategoTerm e_193 = null;
      IStrategoTerm g_193 = null;
      IStrategoTerm h_193 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail344;
      c_193 = term.getSubterm(0);
      d_193 = term.getSubterm(1);
      e_193 = term.getSubterm(2);
      IStrategoList annos288 = term.getAnnotations();
      f_193 = annos288;
      term = d_47.invoke(context, c_193);
      if(term == null)
        break Fail344;
      g_193 = term;
      term = e_47.invoke(context, d_193);
      if(term == null)
        break Fail344;
      h_193 = term;
      term = f_47.invoke(context, e_193);
      if(term == null)
        break Fail344;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallT_3, new IStrategoTerm[]{g_193, h_193, term}), checkListAnnos(termFactory, f_193));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}