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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail144:
    { 
      IStrategoTerm s_124 = null;
      IStrategoTerm q_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      q_124 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      s_124 = annos114;
      term = q_23.invoke(context, q_124);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}