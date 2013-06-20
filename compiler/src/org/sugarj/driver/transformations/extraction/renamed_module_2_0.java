package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamed_module_2_0 extends Strategy 
{ 
  public static renamed_module_2_0 instance = new renamed_module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_26, Strategy v_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamed_module_2_0");
    Fail212:
    { 
      IStrategoTerm l_137 = null;
      IStrategoTerm j_137 = null;
      IStrategoTerm k_137 = null;
      IStrategoTerm m_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consrenamed_module_2 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      j_137 = term.getSubterm(0);
      k_137 = term.getSubterm(1);
      IStrategoList annos172 = term.getAnnotations();
      l_137 = annos172;
      term = u_26.invoke(context, j_137);
      if(term == null)
        break Fail212;
      m_137 = term;
      term = v_26.invoke(context, k_137);
      if(term == null)
        break Fail212;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consrenamed_module_2, new IStrategoTerm[]{m_137, term}), checkListAnnos(termFactory, l_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}