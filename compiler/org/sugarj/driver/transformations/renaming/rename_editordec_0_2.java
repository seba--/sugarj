package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_editordec_0_2 extends Strategy 
{ 
  public static rename_editordec_0_2 instance = new rename_editordec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_15, IStrategoTerm j_15)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5:
    { 
      IStrategoTerm k_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEditorServicesDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5;
      k_15 = term.getSubterm(0);
      IStrategoTerm arg2 = term.getSubterm(1);
      if(arg2.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg2).getConstructor())
        break Fail5;
      if(arg2.getSubterm(0) != i_15 && !i_15.match(arg2.getSubterm(0)))
        break Fail5;
      term = termFactory.makeAppl(renaming._consEditorServicesDecHead_2, new IStrategoTerm[]{k_15, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{j_15})});
      if(true)
        return term;
    }
    context.push("rename_editordec_0_2");
    context.popOnFailure();
    return null;
  }
}