package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail143:
    { 
      IStrategoTerm j_124 = null;
      IStrategoTerm g_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      g_124 = term.getSubterm(0);
      IStrategoList annos113 = term.getAnnotations();
      j_124 = annos113;
      term = o_23.invoke(context, g_124);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}