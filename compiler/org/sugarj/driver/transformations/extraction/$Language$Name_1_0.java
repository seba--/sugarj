package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Language$Name_1_0 extends Strategy 
{ 
  public static $Language$Name_1_0 instance = new $Language$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LanguageName_1_0");
    Fail822:
    { 
      IStrategoTerm d_435 = null;
      IStrategoTerm c_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLanguageName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail822;
      c_435 = term.getSubterm(0);
      IStrategoList annos70 = term.getAnnotations();
      d_435 = annos70;
      term = z_337.invoke(context, c_435);
      if(term == null)
        break Fail822;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLanguageName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}