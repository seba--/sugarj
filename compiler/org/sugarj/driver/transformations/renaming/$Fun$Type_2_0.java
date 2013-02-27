package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_16, Strategy w_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail113:
    { 
      IStrategoTerm m_109 = null;
      IStrategoTerm j_109 = null;
      IStrategoTerm l_109 = null;
      IStrategoTerm n_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      j_109 = term.getSubterm(0);
      l_109 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      m_109 = annos100;
      term = v_16.invoke(context, j_109);
      if(term == null)
        break Fail113;
      n_109 = term;
      term = w_16.invoke(context, l_109);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFunType_2, new IStrategoTerm[]{n_109, term}), checkListAnnos(termFactory, m_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}