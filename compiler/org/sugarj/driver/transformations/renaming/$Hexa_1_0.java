package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Hexa_1_0 extends Strategy 
{ 
  public static $Hexa_1_0 instance = new $Hexa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Hexa_1_0");
    Fail196:
    { 
      IStrategoTerm m_136 = null;
      IStrategoTerm l_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consHexa_1 != ((IStrategoAppl)term).getConstructor())
        break Fail196;
      l_136 = term.getSubterm(0);
      IStrategoList annos164 = term.getAnnotations();
      m_136 = annos164;
      term = x_26.invoke(context, l_136);
      if(term == null)
        break Fail196;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consHexa_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}