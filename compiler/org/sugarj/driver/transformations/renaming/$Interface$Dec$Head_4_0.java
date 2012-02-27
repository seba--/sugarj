package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec$Head_4_0 extends Strategy 
{ 
  public static $Interface$Dec$Head_4_0 instance = new $Interface$Dec$Head_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_16, Strategy o_16, Strategy p_16, Strategy q_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDecHead_4_0");
    Fail41:
    { 
      IStrategoTerm m_104 = null;
      IStrategoTerm i_104 = null;
      IStrategoTerm j_104 = null;
      IStrategoTerm k_104 = null;
      IStrategoTerm l_104 = null;
      IStrategoTerm n_104 = null;
      IStrategoTerm o_104 = null;
      IStrategoTerm p_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDecHead_4 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      i_104 = term.getSubterm(0);
      j_104 = term.getSubterm(1);
      k_104 = term.getSubterm(2);
      l_104 = term.getSubterm(3);
      IStrategoList annos27 = term.getAnnotations();
      m_104 = annos27;
      term = n_16.invoke(context, i_104);
      if(term == null)
        break Fail41;
      n_104 = term;
      term = o_16.invoke(context, j_104);
      if(term == null)
        break Fail41;
      o_104 = term;
      term = p_16.invoke(context, k_104);
      if(term == null)
        break Fail41;
      p_104 = term;
      term = q_16.invoke(context, l_104);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{n_104, o_104, p_104, term}), checkListAnnos(termFactory, m_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}