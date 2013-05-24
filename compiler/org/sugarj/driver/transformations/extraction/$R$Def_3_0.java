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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_342, Strategy b_342, Strategy c_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail884:
    { 
      IStrategoTerm h_445 = null;
      IStrategoTerm e_445 = null;
      IStrategoTerm f_445 = null;
      IStrategoTerm g_445 = null;
      IStrategoTerm i_445 = null;
      IStrategoTerm j_445 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail884;
      e_445 = term.getSubterm(0);
      f_445 = term.getSubterm(1);
      g_445 = term.getSubterm(2);
      IStrategoList annos130 = term.getAnnotations();
      h_445 = annos130;
      term = a_342.invoke(context, e_445);
      if(term == null)
        break Fail884;
      i_445 = term;
      term = b_342.invoke(context, f_445);
      if(term == null)
        break Fail884;
      j_445 = term;
      term = c_342.invoke(context, g_445);
      if(term == null)
        break Fail884;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDef_3, new IStrategoTerm[]{i_445, j_445, term}), checkListAnnos(termFactory, h_445));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}