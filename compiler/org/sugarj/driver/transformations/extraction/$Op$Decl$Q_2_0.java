package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_23, Strategy r_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail132:
    { 
      IStrategoTerm n_124 = null;
      IStrategoTerm g_124 = null;
      IStrategoTerm j_124 = null;
      IStrategoTerm o_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      g_124 = term.getSubterm(0);
      j_124 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      n_124 = annos106;
      term = q_23.invoke(context, g_124);
      if(term == null)
        break Fail132;
      o_124 = term;
      term = r_23.invoke(context, j_124);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOpDeclQ_2, new IStrategoTerm[]{o_124, term}), checkListAnnos(termFactory, n_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}