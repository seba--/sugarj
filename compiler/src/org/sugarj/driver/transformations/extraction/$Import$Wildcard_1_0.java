package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Wildcard_1_0 extends Strategy 
{ 
  public static $Import$Wildcard_1_0 instance = new $Import$Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportWildcard_1_0");
    Fail66:
    { 
      IStrategoTerm w_109 = null;
      IStrategoTerm v_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consImportWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      v_109 = term.getSubterm(0);
      IStrategoList annos39 = term.getAnnotations();
      w_109 = annos39;
      term = m_18.invoke(context, v_109);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consImportWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}