package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Def_2_0 extends Strategy 
{ 
  public static $Color$Def_2_0 instance = new $Color$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_337, Strategy h_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorDef_2_0");
    Fail809:
    { 
      IStrategoTerm g_433 = null;
      IStrategoTerm e_433 = null;
      IStrategoTerm f_433 = null;
      IStrategoTerm h_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail809;
      e_433 = term.getSubterm(0);
      f_433 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      g_433 = annos58;
      term = g_337.invoke(context, e_433);
      if(term == null)
        break Fail809;
      h_433 = term;
      term = h_337.invoke(context, f_433);
      if(term == null)
        break Fail809;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorDef_2, new IStrategoTerm[]{h_433, term}), checkListAnnos(termFactory, g_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}