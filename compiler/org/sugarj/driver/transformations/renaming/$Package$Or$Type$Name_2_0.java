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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_31, Strategy e_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageOrTypeName_2_0");
    Fail213:
    { 
      IStrategoTerm f_149 = null;
      IStrategoTerm d_149 = null;
      IStrategoTerm e_149 = null;
      IStrategoTerm g_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail213;
      d_149 = term.getSubterm(0);
      e_149 = term.getSubterm(1);
      IStrategoList annos187 = term.getAnnotations();
      f_149 = annos187;
      term = d_31.invoke(context, d_149);
      if(term == null)
        break Fail213;
      g_149 = term;
      term = e_31.invoke(context, e_149);
      if(term == null)
        break Fail213;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageOrTypeName_2, new IStrategoTerm[]{g_149, term}), checkListAnnos(termFactory, f_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}