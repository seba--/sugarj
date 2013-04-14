package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_23, Strategy t_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail134:
    { 
      IStrategoTerm t_124 = null;
      IStrategoTerm q_124 = null;
      IStrategoTerm s_124 = null;
      IStrategoTerm u_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      q_124 = term.getSubterm(0);
      s_124 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      t_124 = annos107;
      term = s_23.invoke(context, q_124);
      if(term == null)
        break Fail134;
      u_124 = term;
      term = t_23.invoke(context, s_124);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOpDecl_2, new IStrategoTerm[]{u_124, term}), checkListAnnos(termFactory, t_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}