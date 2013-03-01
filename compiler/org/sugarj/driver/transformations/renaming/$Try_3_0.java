package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_3_0 extends Strategy 
{ 
  public static $Try_3_0 instance = new $Try_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_33, Strategy k_33, Strategy l_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_3_0");
    Fail113:
    { 
      IStrategoTerm f_149 = null;
      IStrategoTerm c_149 = null;
      IStrategoTerm d_149 = null;
      IStrategoTerm e_149 = null;
      IStrategoTerm g_149 = null;
      IStrategoTerm h_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTry_3 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      c_149 = term.getSubterm(0);
      d_149 = term.getSubterm(1);
      e_149 = term.getSubterm(2);
      IStrategoList annos86 = term.getAnnotations();
      f_149 = annos86;
      term = j_33.invoke(context, c_149);
      if(term == null)
        break Fail113;
      g_149 = term;
      term = k_33.invoke(context, d_149);
      if(term == null)
        break Fail113;
      h_149 = term;
      term = l_33.invoke(context, e_149);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTry_3, new IStrategoTerm[]{g_149, h_149, term}), checkListAnnos(termFactory, f_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}