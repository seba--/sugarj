package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl$Inj_1_0 extends Strategy 
{ 
  public static $Op$Decl$Inj_1_0 instance = new $Op$Decl$Inj_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail118:
    { 
      IStrategoTerm l_110 = null;
      IStrategoTerm k_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      k_110 = term.getSubterm(0);
      IStrategoList annos105 = term.getAnnotations();
      l_110 = annos105;
      term = g_17.invoke(context, k_110);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}