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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_16, Strategy c_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDecHead_2_0");
    Fail40:
    { 
      IStrategoTerm m_104 = null;
      IStrategoTerm k_104 = null;
      IStrategoTerm l_104 = null;
      IStrategoTerm n_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      k_104 = term.getSubterm(0);
      l_104 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      m_104 = annos31;
      term = b_16.invoke(context, k_104);
      if(term == null)
        break Fail40;
      n_104 = term;
      term = c_16.invoke(context, l_104);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{n_104, term}), checkListAnnos(termFactory, m_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}