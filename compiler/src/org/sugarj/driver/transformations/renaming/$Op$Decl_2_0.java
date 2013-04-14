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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail119:
    { 
      IStrategoTerm d_111 = null;
      IStrategoTerm v_110 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm e_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      v_110 = term.getSubterm(0);
      b_111 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      d_111 = annos107;
      term = m_17.invoke(context, v_110);
      if(term == null)
        break Fail119;
      e_111 = term;
      term = n_17.invoke(context, b_111);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDecl_2, new IStrategoTerm[]{e_111, term}), checkListAnnos(termFactory, d_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}