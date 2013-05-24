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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail901:
    { 
      IStrategoTerm g_448 = null;
      IStrategoTerm f_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail901;
      f_448 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      g_448 = annos147;
      term = f_343.invoke(context, f_448);
      if(term == null)
        break Fail901;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}