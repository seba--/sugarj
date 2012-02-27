package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec_2_0 extends Strategy 
{ 
  public static $Method$Dec_2_0 instance = new $Method$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_19, Strategy q_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDec_2_0");
    Fail70:
    { 
      IStrategoTerm j_112 = null;
      IStrategoTerm h_112 = null;
      IStrategoTerm i_112 = null;
      IStrategoTerm k_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      h_112 = term.getSubterm(0);
      i_112 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      j_112 = annos54;
      term = p_19.invoke(context, h_112);
      if(term == null)
        break Fail70;
      k_112 = term;
      term = q_19.invoke(context, i_112);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDec_2, new IStrategoTerm[]{k_112, term}), checkListAnnos(termFactory, j_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}