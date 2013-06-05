package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Var_1_0 extends Strategy 
{ 
  public static $List$Var_1_0 instance = new $List$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail64:
    { 
      IStrategoTerm m_109 = null;
      IStrategoTerm l_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      l_109 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      m_109 = annos37;
      term = j_18.invoke(context, l_109);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}