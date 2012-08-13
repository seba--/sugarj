package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec$Head_2_0 extends Strategy 
{ 
  public static $Anno$Dec$Head_2_0 instance = new $Anno$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_22, Strategy c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDecHead_2_0");
    Fail91:
    { 
      IStrategoTerm p_117 = null;
      IStrategoTerm n_117 = null;
      IStrategoTerm o_117 = null;
      IStrategoTerm q_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      n_117 = term.getSubterm(0);
      o_117 = term.getSubterm(1);
      IStrategoList annos72 = term.getAnnotations();
      p_117 = annos72;
      term = b_22.invoke(context, n_117);
      if(term == null)
        break Fail91;
      q_117 = term;
      term = c_22.invoke(context, o_117);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{q_117, term}), checkListAnnos(termFactory, p_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}