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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_23, Strategy s_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail145:
    { 
      IStrategoTerm w_124 = null;
      IStrategoTerm u_124 = null;
      IStrategoTerm v_124 = null;
      IStrategoTerm x_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      u_124 = term.getSubterm(0);
      v_124 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      w_124 = annos115;
      term = r_23.invoke(context, u_124);
      if(term == null)
        break Fail145;
      x_124 = term;
      term = s_23.invoke(context, v_124);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOpDeclQ_2, new IStrategoTerm[]{x_124, term}), checkListAnnos(termFactory, w_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}