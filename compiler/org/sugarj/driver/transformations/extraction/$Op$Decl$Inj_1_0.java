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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail132:
    { 
      IStrategoTerm d_124 = null;
      IStrategoTerm c_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      c_124 = term.getSubterm(0);
      IStrategoList annos105 = term.getAnnotations();
      d_124 = annos105;
      term = p_23.invoke(context, c_124);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}