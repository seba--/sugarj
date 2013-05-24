package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pretty$Print_1_0 extends Strategy 
{ 
  public static $Pretty$Print_1_0 instance = new $Pretty$Print_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrettyPrint_1_0");
    Fail757:
    { 
      IStrategoTerm m_427 = null;
      IStrategoTerm l_427 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPrettyPrint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail757;
      l_427 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      m_427 = annos29;
      term = y_334.invoke(context, l_427);
      if(term == null)
        break Fail757;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPrettyPrint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_427));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}