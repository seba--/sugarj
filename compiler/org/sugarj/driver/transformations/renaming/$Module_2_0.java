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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12, Strategy l_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail48:
    { 
      IStrategoTerm a_97 = null;
      IStrategoTerm y_96 = null;
      IStrategoTerm z_96 = null;
      IStrategoTerm c_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      y_96 = term.getSubterm(0);
      z_96 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      a_97 = annos38;
      term = k_12.invoke(context, y_96);
      if(term == null)
        break Fail48;
      c_97 = term;
      term = l_12.invoke(context, z_96);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModule_2, new IStrategoTerm[]{c_97, term}), checkListAnnos(termFactory, a_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}