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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail113:
    { 
      IStrategoTerm x_118 = null;
      IStrategoTerm w_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      w_118 = term.getSubterm(0);
      IStrategoList annos85 = term.getAnnotations();
      x_118 = annos85;
      term = u_21.invoke(context, w_118);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}