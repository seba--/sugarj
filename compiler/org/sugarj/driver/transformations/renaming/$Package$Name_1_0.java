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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageName_1_0");
    Fail213:
    { 
      IStrategoTerm v_172 = null;
      IStrategoTerm t_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPackageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail213;
      t_172 = term.getSubterm(0);
      IStrategoList annos182 = term.getAnnotations();
      v_172 = annos182;
      term = a_40.invoke(context, t_172);
      if(term == null)
        break Fail213;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPackageName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_172));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}