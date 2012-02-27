package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Var$Dec$Id_2_0 extends Strategy 
{ 
  public static $Array$Var$Dec$Id_2_0 instance = new $Array$Var$Dec$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_21, Strategy m_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayVarDecId_2_0");
    Fail99:
    { 
      IStrategoTerm j_117 = null;
      IStrategoTerm h_117 = null;
      IStrategoTerm i_117 = null;
      IStrategoTerm k_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayVarDecId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      h_117 = term.getSubterm(0);
      i_117 = term.getSubterm(1);
      IStrategoList annos80 = term.getAnnotations();
      j_117 = annos80;
      term = l_21.invoke(context, h_117);
      if(term == null)
        break Fail99;
      k_117 = term;
      term = m_21.invoke(context, i_117);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayVarDecId_2, new IStrategoTerm[]{k_117, term}), checkListAnnos(termFactory, j_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}