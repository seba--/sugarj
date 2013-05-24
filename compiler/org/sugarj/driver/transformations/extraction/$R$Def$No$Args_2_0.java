package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_341, Strategy z_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail883:
    { 
      IStrategoTerm b_445 = null;
      IStrategoTerm z_444 = null;
      IStrategoTerm a_445 = null;
      IStrategoTerm c_445 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail883;
      z_444 = term.getSubterm(0);
      a_445 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      b_445 = annos129;
      term = y_341.invoke(context, z_444);
      if(term == null)
        break Fail883;
      c_445 = term;
      term = z_341.invoke(context, a_445);
      if(term == null)
        break Fail883;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDefNoArgs_2, new IStrategoTerm[]{c_445, term}), checkListAnnos(termFactory, b_445));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}