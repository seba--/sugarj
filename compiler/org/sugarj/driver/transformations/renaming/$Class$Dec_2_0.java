package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec_2_0 extends Strategy 
{ 
  public static $Class$Dec_2_0 instance = new $Class$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_15, Strategy o_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDec_2_0");
    Fail34:
    { 
      IStrategoTerm b_103 = null;
      IStrategoTerm z_102 = null;
      IStrategoTerm a_103 = null;
      IStrategoTerm c_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      z_102 = term.getSubterm(0);
      a_103 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      b_103 = annos25;
      term = n_15.invoke(context, z_102);
      if(term == null)
        break Fail34;
      c_103 = term;
      term = o_15.invoke(context, a_103);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDec_2, new IStrategoTerm[]{c_103, term}), checkListAnnos(termFactory, b_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}