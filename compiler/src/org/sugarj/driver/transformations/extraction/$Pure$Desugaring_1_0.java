package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pure$Desugaring_1_0 extends Strategy 
{ 
  public static $Pure$Desugaring_1_0 instance = new $Pure$Desugaring_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PureDesugaring_1_0");
    Fail34:
    { 
      IStrategoTerm m_103 = null;
      IStrategoTerm l_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consPureDesugaring_1 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      l_103 = term.getSubterm(0);
      IStrategoList annos7 = term.getAnnotations();
      m_103 = annos7;
      term = e_16.invoke(context, l_103);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consPureDesugaring_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}