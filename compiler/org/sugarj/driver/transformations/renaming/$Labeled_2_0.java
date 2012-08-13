package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled_2_0 extends Strategy 
{ 
  public static $Labeled_2_0 instance = new $Labeled_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_26, Strategy j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Labeled_2_0");
    Fail140:
    { 
      IStrategoTerm f_129 = null;
      IStrategoTerm d_129 = null;
      IStrategoTerm e_129 = null;
      IStrategoTerm g_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLabeled_2 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      d_129 = term.getSubterm(0);
      e_129 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      f_129 = annos118;
      term = i_26.invoke(context, d_129);
      if(term == null)
        break Fail140;
      g_129 = term;
      term = j_26.invoke(context, e_129);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLabeled_2, new IStrategoTerm[]{g_129, term}), checkListAnnos(termFactory, f_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}