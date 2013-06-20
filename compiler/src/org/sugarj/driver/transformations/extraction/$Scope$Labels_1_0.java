package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Labels_1_0 extends Strategy 
{ 
  public static $Scope$Labels_1_0 instance = new $Scope$Labels_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail53:
    { 
      IStrategoTerm b_107 = null;
      IStrategoTerm a_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      a_107 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      b_107 = annos26;
      term = m_17.invoke(context, a_107);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}