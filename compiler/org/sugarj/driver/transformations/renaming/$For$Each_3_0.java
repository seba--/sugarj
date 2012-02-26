package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For$Each_3_0 extends Strategy 
{ 
  public static $For$Each_3_0 instance = new $For$Each_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_20, Strategy c_20, Strategy d_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ForEach_3_0");
    Fail82:
    { 
      IStrategoTerm f_114 = null;
      IStrategoTerm c_114 = null;
      IStrategoTerm d_114 = null;
      IStrategoTerm e_114 = null;
      IStrategoTerm g_114 = null;
      IStrategoTerm h_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consForEach_3 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      c_114 = term.getSubterm(0);
      d_114 = term.getSubterm(1);
      e_114 = term.getSubterm(2);
      IStrategoList annos67 = term.getAnnotations();
      f_114 = annos67;
      term = b_20.invoke(context, c_114);
      if(term == null)
        break Fail82;
      g_114 = term;
      term = c_20.invoke(context, d_114);
      if(term == null)
        break Fail82;
      h_114 = term;
      term = d_20.invoke(context, e_114);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consForEach_3, new IStrategoTerm[]{g_114, h_114, term}), checkListAnnos(termFactory, f_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}