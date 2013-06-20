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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_23, Strategy u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail146:
    { 
      IStrategoTerm d_125 = null;
      IStrategoTerm b_125 = null;
      IStrategoTerm c_125 = null;
      IStrategoTerm e_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      b_125 = term.getSubterm(0);
      c_125 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      d_125 = annos116;
      term = t_23.invoke(context, b_125);
      if(term == null)
        break Fail146;
      e_125 = term;
      term = u_23.invoke(context, c_125);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOpDecl_2, new IStrategoTerm[]{e_125, term}), checkListAnnos(termFactory, d_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}