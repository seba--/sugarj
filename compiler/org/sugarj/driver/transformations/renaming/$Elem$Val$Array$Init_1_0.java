package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Elem$Val$Array$Init_1_0 extends Strategy 
{ 
  public static $Elem$Val$Array$Init_1_0 instance = new $Elem$Val$Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValArrayInit_1_0");
    Fail56:
    { 
      IStrategoTerm s_129 = null;
      IStrategoTerm r_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consElemValArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      r_129 = term.getSubterm(0);
      IStrategoList annos32 = term.getAnnotations();
      s_129 = annos32;
      term = l_28.invoke(context, r_129);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consElemValArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}