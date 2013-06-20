package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alt_2_0 extends Strategy 
{ 
  public static alt_2_0 instance = new alt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_25, Strategy k_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alt_2_0");
    Fail177:
    { 
      IStrategoTerm c_130 = null;
      IStrategoTerm z_129 = null;
      IStrategoTerm a_130 = null;
      IStrategoTerm d_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consalt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      z_129 = term.getSubterm(0);
      a_130 = term.getSubterm(1);
      IStrategoList annos146 = term.getAnnotations();
      c_130 = annos146;
      term = j_25.invoke(context, z_129);
      if(term == null)
        break Fail177;
      d_130 = term;
      term = k_25.invoke(context, a_130);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consalt_2, new IStrategoTerm[]{d_130, term}), checkListAnnos(termFactory, c_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}