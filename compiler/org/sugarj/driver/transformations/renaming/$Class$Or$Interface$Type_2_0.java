package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Or$Interface$Type_2_0 extends Strategy 
{ 
  public static $Class$Or$Interface$Type_2_0 instance = new $Class$Or$Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_25, Strategy r_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassOrInterfaceType_2_0");
    Fail159:
    { 
      IStrategoTerm m_129 = null;
      IStrategoTerm h_129 = null;
      IStrategoTerm j_129 = null;
      IStrategoTerm o_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassOrInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      h_129 = term.getSubterm(0);
      j_129 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      m_129 = annos138;
      term = q_25.invoke(context, h_129);
      if(term == null)
        break Fail159;
      o_129 = term;
      term = r_25.invoke(context, j_129);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassOrInterfaceType_2, new IStrategoTerm[]{o_129, term}), checkListAnnos(termFactory, m_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}