package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Package$Or$Type$Name_2_0 extends Strategy 
{ 
  public static $Package$Or$Type$Name_2_0 instance = new $Package$Or$Type$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_25, Strategy t_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_2_0");
    Fail165:
    { 
      IStrategoTerm o_130 = null;
      IStrategoTerm k_130 = null;
      IStrategoTerm m_130 = null;
      IStrategoTerm r_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      k_130 = term.getSubterm(0);
      m_130 = term.getSubterm(1);
      IStrategoList annos146 = term.getAnnotations();
      o_130 = annos146;
      term = s_25.invoke(context, k_130);
      if(term == null)
        break Fail165;
      r_130 = term;
      term = t_25.invoke(context, m_130);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_2, new IStrategoTerm[]{r_130, term}), checkListAnnos(termFactory, o_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}