package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail38:
    { 
      IStrategoTerm e_104 = null;
      IStrategoTerm d_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      d_104 = term.getSubterm(0);
      IStrategoList annos11 = term.getAnnotations();
      e_104 = annos11;
      term = k_16.invoke(context, d_104);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}