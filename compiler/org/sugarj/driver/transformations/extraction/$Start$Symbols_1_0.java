package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Start$Symbols_1_0 extends Strategy 
{ 
  public static $Start$Symbols_1_0 instance = new $Start$Symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StartSymbols_1_0");
    Fail828:
    { 
      IStrategoTerm v_435 = null;
      IStrategoTerm u_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consStartSymbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail828;
      u_435 = term.getSubterm(0);
      IStrategoList annos76 = term.getAnnotations();
      v_435 = annos76;
      term = f_338.invoke(context, u_435);
      if(term == null)
        break Fail828;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consStartSymbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}