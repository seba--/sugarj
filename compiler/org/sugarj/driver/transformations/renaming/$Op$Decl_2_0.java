package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl_2_0 extends Strategy 
{ 
  public static $Op$Decl_2_0 instance = new $Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17, Strategy h_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail120:
    { 
      IStrategoTerm r_110 = null;
      IStrategoTerm p_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm s_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      p_110 = term.getSubterm(0);
      q_110 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      r_110 = annos107;
      term = g_17.invoke(context, p_110);
      if(term == null)
        break Fail120;
      s_110 = term;
      term = h_17.invoke(context, q_110);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDecl_2, new IStrategoTerm[]{s_110, term}), checkListAnnos(termFactory, r_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}