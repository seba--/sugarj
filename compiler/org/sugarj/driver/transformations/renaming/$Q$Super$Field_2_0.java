package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Field_2_0 extends Strategy 
{ 
  public static $Q$Super$Field_2_0 instance = new $Q$Super$Field_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_29, Strategy e_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperField_2_0");
    Fail65:
    { 
      IStrategoTerm j_132 = null;
      IStrategoTerm h_132 = null;
      IStrategoTerm i_132 = null;
      IStrategoTerm m_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consQSuperField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      h_132 = term.getSubterm(0);
      i_132 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      j_132 = annos41;
      term = d_29.invoke(context, h_132);
      if(term == null)
        break Fail65;
      m_132 = term;
      term = e_29.invoke(context, i_132);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consQSuperField_2, new IStrategoTerm[]{m_132, term}), checkListAnnos(termFactory, j_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}