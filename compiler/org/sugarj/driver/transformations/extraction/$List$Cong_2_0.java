package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong_2_0 extends Strategy 
{ 
  public static $List$Cong_2_0 instance = new $List$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_21, Strategy h_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail90:
    { 
      IStrategoTerm h_117 = null;
      IStrategoTerm f_117 = null;
      IStrategoTerm g_117 = null;
      IStrategoTerm i_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      f_117 = term.getSubterm(0);
      g_117 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      h_117 = annos67;
      term = g_21.invoke(context, f_117);
      if(term == null)
        break Fail90;
      i_117 = term;
      term = h_21.invoke(context, g_117);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consListCong_2, new IStrategoTerm[]{i_117, term}), checkListAnnos(termFactory, h_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}