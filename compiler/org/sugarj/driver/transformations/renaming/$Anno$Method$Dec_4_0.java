package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Method$Dec_4_0 extends Strategy 
{ 
  public static $Anno$Method$Dec_4_0 instance = new $Anno$Method$Dec_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21, Strategy y_21, Strategy z_21, Strategy a_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoMethodDec_4_0");
    Fail90:
    { 
      IStrategoTerm i_117 = null;
      IStrategoTerm e_117 = null;
      IStrategoTerm f_117 = null;
      IStrategoTerm g_117 = null;
      IStrategoTerm h_117 = null;
      IStrategoTerm j_117 = null;
      IStrategoTerm k_117 = null;
      IStrategoTerm l_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoMethodDec_4 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      e_117 = term.getSubterm(0);
      f_117 = term.getSubterm(1);
      g_117 = term.getSubterm(2);
      h_117 = term.getSubterm(3);
      IStrategoList annos71 = term.getAnnotations();
      i_117 = annos71;
      term = x_21.invoke(context, e_117);
      if(term == null)
        break Fail90;
      j_117 = term;
      term = y_21.invoke(context, f_117);
      if(term == null)
        break Fail90;
      k_117 = term;
      term = z_21.invoke(context, g_117);
      if(term == null)
        break Fail90;
      l_117 = term;
      term = a_22.invoke(context, h_117);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoMethodDec_4, new IStrategoTerm[]{j_117, k_117, l_117, term}), checkListAnnos(termFactory, i_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}