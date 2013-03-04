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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_30, Strategy k_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDecHead_2_0");
    Fail81:
    { 
      IStrategoTerm h_138 = null;
      IStrategoTerm f_138 = null;
      IStrategoTerm g_138 = null;
      IStrategoTerm i_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      f_138 = term.getSubterm(0);
      g_138 = term.getSubterm(1);
      IStrategoList annos57 = term.getAnnotations();
      h_138 = annos57;
      term = j_30.invoke(context, f_138);
      if(term == null)
        break Fail81;
      i_138 = term;
      term = k_30.invoke(context, g_138);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoDecHead_2, new IStrategoTerm[]{i_138, term}), checkListAnnos(termFactory, h_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}