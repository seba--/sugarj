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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_25, Strategy e_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_2_0");
    Fail162:
    { 
      IStrategoTerm r_129 = null;
      IStrategoTerm o_129 = null;
      IStrategoTerm q_129 = null;
      IStrategoTerm s_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      o_129 = term.getSubterm(0);
      q_129 = term.getSubterm(1);
      IStrategoList annos146 = term.getAnnotations();
      r_129 = annos146;
      term = d_25.invoke(context, o_129);
      if(term == null)
        break Fail162;
      s_129 = term;
      term = e_25.invoke(context, q_129);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_2, new IStrategoTerm[]{s_129, term}), checkListAnnos(termFactory, r_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}