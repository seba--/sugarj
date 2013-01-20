package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Name_1_0 extends Strategy 
{ 
  public static $Type$Name_1_0 instance = new $Type$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_1_0");
    Fail210:
    { 
      IStrategoTerm d_172 = null;
      IStrategoTerm c_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail210;
      c_172 = term.getSubterm(0);
      IStrategoList annos179 = term.getAnnotations();
      d_172 = annos179;
      term = w_39.invoke(context, c_172);
      if(term == null)
        break Fail210;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_172));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}