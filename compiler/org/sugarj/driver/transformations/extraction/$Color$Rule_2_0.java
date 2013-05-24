package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Rule_2_0 extends Strategy 
{ 
  public static $Color$Rule_2_0 instance = new $Color$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_336, Strategy q_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRule_2_0");
    Fail786:
    { 
      IStrategoTerm q_431 = null;
      IStrategoTerm o_431 = null;
      IStrategoTerm p_431 = null;
      IStrategoTerm r_431 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail786;
      o_431 = term.getSubterm(0);
      p_431 = term.getSubterm(1);
      IStrategoList annos50 = term.getAnnotations();
      q_431 = annos50;
      term = p_336.invoke(context, o_431);
      if(term == null)
        break Fail786;
      r_431 = term;
      term = q_336.invoke(context, p_431);
      if(term == null)
        break Fail786;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorRule_2, new IStrategoTerm[]{r_431, term}), checkListAnnos(termFactory, q_431));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}