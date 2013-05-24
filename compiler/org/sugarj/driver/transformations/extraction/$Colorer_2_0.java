package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Colorer_2_0 extends Strategy 
{ 
  public static $Colorer_2_0 instance = new $Colorer_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_336, Strategy m_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Colorer_2_0");
    Fail784:
    { 
      IStrategoTerm g_431 = null;
      IStrategoTerm e_431 = null;
      IStrategoTerm f_431 = null;
      IStrategoTerm h_431 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorer_2 != ((IStrategoAppl)term).getConstructor())
        break Fail784;
      e_431 = term.getSubterm(0);
      f_431 = term.getSubterm(1);
      IStrategoList annos48 = term.getAnnotations();
      g_431 = annos48;
      term = l_336.invoke(context, e_431);
      if(term == null)
        break Fail784;
      h_431 = term;
      term = m_336.invoke(context, f_431);
      if(term == null)
        break Fail784;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorer_2, new IStrategoTerm[]{h_431, term}), checkListAnnos(termFactory, g_431));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}