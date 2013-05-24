package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Anno$List_1_0 extends Strategy 
{ 
  public static $No$Anno$List_1_0 instance = new $No$Anno$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail932:
    { 
      IStrategoTerm a_453 = null;
      IStrategoTerm z_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail932;
      z_452 = term.getSubterm(0);
      IStrategoList annos177 = term.getAnnotations();
      a_453 = annos177;
      term = a_345.invoke(context, z_452);
      if(term == null)
        break Fail932;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}