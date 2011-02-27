package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_3_0 extends Strategy 
{ 
  public static module_3_0 instance = new module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_27, Strategy d_27, Strategy e_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_3_0");
    Fail206:
    { 
      IStrategoTerm g_138 = null;
      IStrategoTerm d_138 = null;
      IStrategoTerm e_138 = null;
      IStrategoTerm f_138 = null;
      IStrategoTerm h_138 = null;
      IStrategoTerm i_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consmodule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      d_138 = term.getSubterm(0);
      e_138 = term.getSubterm(1);
      f_138 = term.getSubterm(2);
      IStrategoList annos170 = term.getAnnotations();
      g_138 = annos170;
      term = c_27.invoke(context, d_138);
      if(term == null)
        break Fail206;
      h_138 = term;
      term = d_27.invoke(context, e_138);
      if(term == null)
        break Fail206;
      i_138 = term;
      term = e_27.invoke(context, f_138);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consmodule_3, new IStrategoTerm[]{h_138, i_138, term}), checkListAnnos(termFactory, g_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}