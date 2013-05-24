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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail952:
    { 
      IStrategoTerm s_455 = null;
      IStrategoTerm r_455 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail952;
      r_455 = term.getSubterm(0);
      IStrategoList annos195 = term.getAnnotations();
      s_455 = annos195;
      term = a_346.invoke(context, r_455);
      if(term == null)
        break Fail952;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}