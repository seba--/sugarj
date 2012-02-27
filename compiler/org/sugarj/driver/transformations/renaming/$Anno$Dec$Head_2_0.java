package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec$Head_2_0 extends Strategy 
{ 
  public static $Anno$Dec$Head_2_0 instance = new $Anno$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_16, Strategy z_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDecHead_2_0");
    Fail45:
    { 
      IStrategoTerm k_105 = null;
      IStrategoTerm i_105 = null;
      IStrategoTerm j_105 = null;
      IStrategoTerm l_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      i_105 = term.getSubterm(0);
      j_105 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      k_105 = annos31;
      term = y_16.invoke(context, i_105);
      if(term == null)
        break Fail45;
      l_105 = term;
      term = z_16.invoke(context, j_105);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{l_105, term}), checkListAnnos(termFactory, k_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}