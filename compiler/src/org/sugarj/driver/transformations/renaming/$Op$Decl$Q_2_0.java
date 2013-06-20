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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17, Strategy l_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail118:
    { 
      IStrategoTerm s_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm r_110 = null;
      IStrategoTerm t_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      q_110 = term.getSubterm(0);
      r_110 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      s_110 = annos106;
      term = k_17.invoke(context, q_110);
      if(term == null)
        break Fail118;
      t_110 = term;
      term = l_17.invoke(context, r_110);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclQ_2, new IStrategoTerm[]{t_110, term}), checkListAnnos(termFactory, s_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}