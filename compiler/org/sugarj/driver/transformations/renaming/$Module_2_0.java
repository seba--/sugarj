package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_43, Strategy b_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail285:
    { 
      IStrategoTerm z_181 = null;
      IStrategoTerm x_181 = null;
      IStrategoTerm y_181 = null;
      IStrategoTerm a_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail285;
      x_181 = term.getSubterm(0);
      y_181 = term.getSubterm(1);
      IStrategoList annos232 = term.getAnnotations();
      z_181 = annos232;
      term = a_43.invoke(context, x_181);
      if(term == null)
        break Fail285;
      a_182 = term;
      term = b_43.invoke(context, y_181);
      if(term == null)
        break Fail285;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModule_2, new IStrategoTerm[]{a_182, term}), checkListAnnos(termFactory, z_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}