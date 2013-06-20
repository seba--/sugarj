package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Undefine$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Undefine$Dyn$Rule_2_0 instance = new $Undefine$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_17, Strategy j_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail51:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm p_106 = null;
      IStrategoTerm q_106 = null;
      IStrategoTerm s_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      p_106 = term.getSubterm(0);
      q_106 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      r_106 = annos24;
      term = i_17.invoke(context, p_106);
      if(term == null)
        break Fail51;
      s_106 = term;
      term = j_17.invoke(context, q_106);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consUndefineDynRule_2, new IStrategoTerm[]{s_106, term}), checkListAnnos(termFactory, r_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}