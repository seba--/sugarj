package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Anno$List_1_0 extends Strategy 
{ 
  public static $No$Anno$List_1_0 instance = new $No$Anno$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail158:
    { 
      IStrategoTerm s_126 = null;
      IStrategoTerm r_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      r_126 = term.getSubterm(0);
      IStrategoList annos127 = term.getAnnotations();
      s_126 = annos127;
      term = i_24.invoke(context, r_126);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}