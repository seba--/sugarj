package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Op$Decl$Q_2_0 instance = new $Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17, Strategy f_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail119:
    { 
      IStrategoTerm m_110 = null;
      IStrategoTerm k_110 = null;
      IStrategoTerm l_110 = null;
      IStrategoTerm n_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      k_110 = term.getSubterm(0);
      l_110 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      m_110 = annos106;
      term = e_17.invoke(context, k_110);
      if(term == null)
        break Fail119;
      n_110 = term;
      term = f_17.invoke(context, l_110);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclQ_2, new IStrategoTerm[]{n_110, term}), checkListAnnos(termFactory, m_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}