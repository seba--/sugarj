package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_41, Strategy p_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail262:
    { 
      IStrategoTerm q_177 = null;
      IStrategoTerm o_177 = null;
      IStrategoTerm p_177 = null;
      IStrategoTerm r_177 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail262;
      o_177 = term.getSubterm(0);
      p_177 = term.getSubterm(1);
      IStrategoList annos209 = term.getAnnotations();
      q_177 = annos209;
      term = o_41.invoke(context, o_177);
      if(term == null)
        break Fail262;
      r_177 = term;
      term = p_41.invoke(context, p_177);
      if(term == null)
        break Fail262;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consUndefineDynRule_2, new IStrategoTerm[]{r_177, term}), checkListAnnos(termFactory, q_177));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}