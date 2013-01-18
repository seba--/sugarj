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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NamedEscape_1_0");
    Fail246:
    { 
      IStrategoTerm j_174 = null;
      IStrategoTerm i_174 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNamedEscape_1 != ((IStrategoAppl)term).getConstructor())
        break Fail246;
      i_174 = term.getSubterm(0);
      IStrategoList annos193 = term.getAnnotations();
      j_174 = annos193;
      term = l_40.invoke(context, i_174);
      if(term == null)
        break Fail246;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNamedEscape_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_174));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}