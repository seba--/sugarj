package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlay$No$Args_2_0 extends Strategy 
{ 
  public static $Overlay$No$Args_2_0 instance = new $Overlay$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_11, Strategy v_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail32:
    { 
      IStrategoTerm h_95 = null;
      IStrategoTerm f_95 = null;
      IStrategoTerm g_95 = null;
      IStrategoTerm i_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      f_95 = term.getSubterm(0);
      g_95 = term.getSubterm(1);
      IStrategoList annos26 = term.getAnnotations();
      h_95 = annos26;
      term = u_11.invoke(context, f_95);
      if(term == null)
        break Fail32;
      i_95 = term;
      term = v_11.invoke(context, g_95);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlayNoArgs_2, new IStrategoTerm[]{i_95, term}), checkListAnnos(termFactory, h_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}