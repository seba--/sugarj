package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Named$Escape_1_0 extends Strategy 
{ 
  public static $Named$Escape_1_0 instance = new $Named$Escape_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NamedEscape_1_0");
    Fail205:
    { 
      IStrategoTerm f_135 = null;
      IStrategoTerm d_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNamedEscape_1 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      d_135 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      f_135 = annos167;
      term = d_26.invoke(context, d_135);
      if(term == null)
        break Fail205;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNamedEscape_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}