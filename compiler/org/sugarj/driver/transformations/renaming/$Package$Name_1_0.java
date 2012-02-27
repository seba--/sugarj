package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Package$Name_1_0 extends Strategy 
{ 
  public static $Package$Name_1_0 instance = new $Package$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageName_1_0");
    Fail177:
    { 
      IStrategoTerm o_134 = null;
      IStrategoTerm v_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      v_133 = term.getSubterm(0);
      IStrategoList annos156 = term.getAnnotations();
      o_134 = annos156;
      term = p_26.invoke(context, v_133);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}