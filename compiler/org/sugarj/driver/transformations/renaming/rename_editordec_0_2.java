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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_24, IStrategoTerm f_24)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail10:
    { 
      IStrategoTerm g_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEditorServicesDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail10;
      g_24 = term.getSubterm(0);
      IStrategoTerm arg2 = term.getSubterm(1);
      if(arg2.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg2).getConstructor())
        break Fail10;
      if(arg2.getSubterm(0) != e_24 && !e_24.match(arg2.getSubterm(0)))
        break Fail10;
      term = termFactory.makeAppl(out._consEditorServicesDecHead_2, new IStrategoTerm[]{g_24, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{f_24})});
      if(true)
        return term;
    }
    context.push("rename_editordec_0_2");
    context.popOnFailure();
    return null;
  }
}