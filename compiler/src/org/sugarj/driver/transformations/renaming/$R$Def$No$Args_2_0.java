package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$No$Args_2_0 extends Strategy 
{ 
  public static $R$Def$No$Args_2_0 instance = new $R$Def$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_11, Strategy v_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail33:
    { 
      IStrategoTerm a_95 = null;
      IStrategoTerm y_94 = null;
      IStrategoTerm z_94 = null;
      IStrategoTerm b_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      y_94 = term.getSubterm(0);
      z_94 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      a_95 = annos24;
      term = u_11.invoke(context, y_94);
      if(term == null)
        break Fail33;
      b_95 = term;
      term = v_11.invoke(context, z_94);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{b_95, term}), checkListAnnos(termFactory, a_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}