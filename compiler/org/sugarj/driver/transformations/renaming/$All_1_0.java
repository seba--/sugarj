package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail333:
    { 
      IStrategoTerm b_191 = null;
      IStrategoTerm a_191 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail333;
      a_191 = term.getSubterm(0);
      IStrategoList annos279 = term.getAnnotations();
      b_191 = annos279;
      term = m_46.invoke(context, a_191);
      if(term == null)
        break Fail333;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_191));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}