package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Member_3_0 extends Strategy 
{ 
  public static $Member_3_0 instance = new $Member_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25, Strategy c_25, Strategy d_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Member_3_0");
    Fail154:
    { 
      IStrategoTerm h_128 = null;
      IStrategoTerm e_128 = null;
      IStrategoTerm f_128 = null;
      IStrategoTerm g_128 = null;
      IStrategoTerm i_128 = null;
      IStrategoTerm j_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMember_3 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      e_128 = term.getSubterm(0);
      f_128 = term.getSubterm(1);
      g_128 = term.getSubterm(2);
      IStrategoList annos135 = term.getAnnotations();
      h_128 = annos135;
      term = b_25.invoke(context, e_128);
      if(term == null)
        break Fail154;
      i_128 = term;
      term = c_25.invoke(context, f_128);
      if(term == null)
        break Fail154;
      j_128 = term;
      term = d_25.invoke(context, g_128);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMember_3, new IStrategoTerm[]{i_128, j_128, term}), checkListAnnos(termFactory, h_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}