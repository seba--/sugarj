package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail100:
    { 
      IStrategoTerm d_117 = null;
      IStrategoTerm c_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      c_117 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      d_117 = annos73;
      term = d_21.invoke(context, c_117);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}