package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$No$Args_1_0 extends Strategy 
{ 
  public static $R$Dec$No$Args_1_0 instance = new $R$Dec$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail250:
    { 
      IStrategoTerm c_175 = null;
      IStrategoTerm a_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail250;
      a_175 = term.getSubterm(0);
      IStrategoList annos197 = term.getAnnotations();
      c_175 = annos197;
      term = s_40.invoke(context, a_175);
      if(term == null)
        break Fail250;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}