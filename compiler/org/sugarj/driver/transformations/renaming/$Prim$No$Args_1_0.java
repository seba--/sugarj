package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail323:
    { 
      IStrategoTerm p_189 = null;
      IStrategoTerm o_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail323;
      o_189 = term.getSubterm(0);
      IStrategoList annos269 = term.getAnnotations();
      p_189 = annos269;
      term = y_45.invoke(context, o_189);
      if(term == null)
        break Fail323;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}