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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NamedEscape_1_0");
    Fail256:
    { 
      IStrategoTerm q_152 = null;
      IStrategoTerm p_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNamedEscape_1 != ((IStrategoAppl)term).getConstructor())
        break Fail256;
      p_152 = term.getSubterm(0);
      IStrategoList annos208 = term.getAnnotations();
      q_152 = annos208;
      term = d_32.invoke(context, p_152);
      if(term == null)
        break Fail256;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNamedEscape_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}