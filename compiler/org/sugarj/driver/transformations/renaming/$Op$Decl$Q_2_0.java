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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_17, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail119:
    { 
      IStrategoTerm p_110 = null;
      IStrategoTerm n_110 = null;
      IStrategoTerm o_110 = null;
      IStrategoTerm q_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      n_110 = term.getSubterm(0);
      o_110 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      p_110 = annos106;
      term = h_17.invoke(context, n_110);
      if(term == null)
        break Fail119;
      q_110 = term;
      term = i_17.invoke(context, o_110);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclQ_2, new IStrategoTerm[]{q_110, term}), checkListAnnos(termFactory, p_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}