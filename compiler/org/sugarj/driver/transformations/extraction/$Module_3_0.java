package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_3_0 extends Strategy 
{ 
  public static $Module_3_0 instance = new $Module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_339, Strategy g_339, Strategy h_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_3_0");
    Fail847:
    { 
      IStrategoTerm h_438 = null;
      IStrategoTerm e_438 = null;
      IStrategoTerm f_438 = null;
      IStrategoTerm g_438 = null;
      IStrategoTerm i_438 = null;
      IStrategoTerm j_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail847;
      e_438 = term.getSubterm(0);
      f_438 = term.getSubterm(1);
      g_438 = term.getSubterm(2);
      IStrategoList annos94 = term.getAnnotations();
      h_438 = annos94;
      term = f_339.invoke(context, e_438);
      if(term == null)
        break Fail847;
      i_438 = term;
      term = g_339.invoke(context, f_438);
      if(term == null)
        break Fail847;
      j_438 = term;
      term = h_339.invoke(context, g_438);
      if(term == null)
        break Fail847;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consModule_3, new IStrategoTerm[]{i_438, j_438, term}), checkListAnnos(termFactory, h_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}