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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23, Strategy q_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail144:
    { 
      IStrategoTerm q_124 = null;
      IStrategoTerm o_124 = null;
      IStrategoTerm p_124 = null;
      IStrategoTerm s_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      o_124 = term.getSubterm(0);
      p_124 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      q_124 = annos114;
      term = p_23.invoke(context, o_124);
      if(term == null)
        break Fail144;
      s_124 = term;
      term = q_23.invoke(context, p_124);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOpDeclQ_2, new IStrategoTerm[]{s_124, term}), checkListAnnos(termFactory, q_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}