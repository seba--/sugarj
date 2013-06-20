package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope_2_0 extends Strategy 
{ 
  public static $Scope_2_0 instance = new $Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_22, Strategy w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_2_0");
    Fail130:
    { 
      IStrategoTerm h_122 = null;
      IStrategoTerm e_122 = null;
      IStrategoTerm f_122 = null;
      IStrategoTerm i_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      e_122 = term.getSubterm(0);
      f_122 = term.getSubterm(1);
      IStrategoList annos102 = term.getAnnotations();
      h_122 = annos102;
      term = v_22.invoke(context, e_122);
      if(term == null)
        break Fail130;
      i_122 = term;
      term = w_22.invoke(context, f_122);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consScope_2, new IStrategoTerm[]{i_122, term}), checkListAnnos(termFactory, h_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}