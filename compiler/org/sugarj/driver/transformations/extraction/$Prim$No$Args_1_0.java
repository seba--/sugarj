package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$No$Args_1_0 extends Strategy 
{ 
  public static $Prim$No$Args_1_0 instance = new $Prim$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail102:
    { 
      IStrategoTerm u_118 = null;
      IStrategoTerm t_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      t_118 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      u_118 = annos77;
      term = v_21.invoke(context, t_118);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}