package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Language$Id_1_0 extends Strategy 
{ 
  public static $Language$Id_1_0 instance = new $Language$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LanguageId_1_0");
    Fail823:
    { 
      IStrategoTerm g_435 = null;
      IStrategoTerm f_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLanguageId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail823;
      f_435 = term.getSubterm(0);
      IStrategoList annos71 = term.getAnnotations();
      g_435 = annos71;
      term = a_338.invoke(context, f_435);
      if(term == null)
        break Fail823;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLanguageId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}