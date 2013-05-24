package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Aliases_1_0 extends Strategy 
{ 
  public static $Aliases_1_0 instance = new $Aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Aliases_1_0");
    Fail831:
    { 
      IStrategoTerm e_436 = null;
      IStrategoTerm d_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail831;
      d_436 = term.getSubterm(0);
      IStrategoList annos79 = term.getAnnotations();
      e_436 = annos79;
      term = l_338.invoke(context, d_436);
      if(term == null)
        break Fail831;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}