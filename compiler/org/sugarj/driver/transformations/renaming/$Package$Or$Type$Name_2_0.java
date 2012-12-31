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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_39, Strategy m_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_2_0");
    Fail203:
    { 
      IStrategoTerm r_170 = null;
      IStrategoTerm p_170 = null;
      IStrategoTerm q_170 = null;
      IStrategoTerm s_170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPackageOrTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail203;
      p_170 = term.getSubterm(0);
      q_170 = term.getSubterm(1);
      IStrategoList annos172 = term.getAnnotations();
      r_170 = annos172;
      term = l_39.invoke(context, p_170);
      if(term == null)
        break Fail203;
      s_170 = term;
      term = m_39.invoke(context, q_170);
      if(term == null)
        break Fail203;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPackageOrTypeName_2, new IStrategoTerm[]{s_170, term}), checkListAnnos(termFactory, r_170));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}