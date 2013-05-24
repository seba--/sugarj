package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prefix_fun_4_0 extends Strategy 
{ 
  public static prefix_fun_4_0 instance = new prefix_fun_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_348, Strategy x_348, Strategy y_348, Strategy z_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prefix_fun_4_0");
    Fail1002:
    { 
      IStrategoTerm f_463 = null;
      IStrategoTerm b_463 = null;
      IStrategoTerm c_463 = null;
      IStrategoTerm d_463 = null;
      IStrategoTerm e_463 = null;
      IStrategoTerm g_463 = null;
      IStrategoTerm h_463 = null;
      IStrategoTerm i_463 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consprefix_fun_4 != ((IStrategoAppl)term).getConstructor())
        break Fail1002;
      b_463 = term.getSubterm(0);
      c_463 = term.getSubterm(1);
      d_463 = term.getSubterm(2);
      e_463 = term.getSubterm(3);
      IStrategoList annos239 = term.getAnnotations();
      f_463 = annos239;
      term = w_348.invoke(context, b_463);
      if(term == null)
        break Fail1002;
      g_463 = term;
      term = x_348.invoke(context, c_463);
      if(term == null)
        break Fail1002;
      h_463 = term;
      term = y_348.invoke(context, d_463);
      if(term == null)
        break Fail1002;
      i_463 = term;
      term = z_348.invoke(context, e_463);
      if(term == null)
        break Fail1002;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consprefix_fun_4, new IStrategoTerm[]{g_463, h_463, i_463, term}), checkListAnnos(termFactory, f_463));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}