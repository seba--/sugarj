package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_1_0 extends Strategy 
{ 
  public static comp_1_0 instance = new comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_1_0");
    Fail188:
    { 
      IStrategoTerm q_132 = null;
      IStrategoTerm o_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscomp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      o_132 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      q_132 = annos157;
      term = z_25.invoke(context, o_132);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscomp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}