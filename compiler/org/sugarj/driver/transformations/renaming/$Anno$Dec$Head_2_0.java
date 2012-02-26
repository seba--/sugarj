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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_16, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDecHead_2_0");
    Fail43:
    { 
      IStrategoTerm c_105 = null;
      IStrategoTerm a_105 = null;
      IStrategoTerm b_105 = null;
      IStrategoTerm d_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      a_105 = term.getSubterm(0);
      b_105 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      c_105 = annos31;
      term = q_16.invoke(context, a_105);
      if(term == null)
        break Fail43;
      d_105 = term;
      term = r_16.invoke(context, b_105);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{d_105, term}), checkListAnnos(termFactory, c_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}